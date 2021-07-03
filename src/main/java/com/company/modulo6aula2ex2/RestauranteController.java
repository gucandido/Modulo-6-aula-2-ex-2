package com.company.modulo6aula2ex2;

import com.company.dao.CaixaDao;
import com.company.dao.MesaDao;
import com.company.dao.PedidoDao;
import com.company.dao.PratoDao;
import com.company.dto.CaixaDto;
import com.company.dto.PedidoDto;
import com.company.dto.PratoDto;
import com.company.model.Mesa;
import com.company.model.Pedido;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestauranteController {

    @GetMapping("/pedido/{idMesa}")
    public PedidoDto getPedidoMesa(@PathVariable int idMesa){

        Pedido p = PedidoDao.getPedidoByMesa(MesaDao.getMesaById(idMesa));

        return new PedidoDto(p);

    }

    @GetMapping("/caixa")
    public CaixaDto getValorCaixa(){
        return new CaixaDto(CaixaDao.getValorCaixa());
    }

    @PostMapping("/prato")
    public PratoDto postPrato(@RequestBody PratoDto prato) {
        PratoDao.savePrato(prato);
        return prato;
    }

    @PostMapping("/pedido/novo")
    public PedidoDto postPedido(@RequestBody PedidoDto pedido){


        Mesa m = MesaDao.getMesaById(pedido.getIdMesa());

        m.setPratos(PratoDto.convert(pedido.getPratos()));

        PedidoDao.savePedido(m);

        return new PedidoDto(PedidoDao.getPedidoByMesa(m));

    }

    @PostMapping("/pedido/fechar")
    public CaixaDto fecharPedido(@RequestBody ObjectNode json){

        Pedido p = PedidoDao.getPedidoByMesa(MesaDao.getMesaById(json.get("idMesa").asInt()));

        PedidoDao.fecharPedido(p);

        return new CaixaDto(CaixaDao.getValorCaixa());

    }


}
