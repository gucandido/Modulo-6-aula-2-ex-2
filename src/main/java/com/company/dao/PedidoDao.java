package com.company.dao;

import com.company.model.Mesa;
import com.company.model.Pedido;

import static com.company.modulo6aula2ex2.Modulo6aula2ex2Application.dBpedidos;

public class PedidoDao {

    public static void savePedido(Mesa m){

        Pedido p = new Pedido(m, m.getPratos());

        if(dBpedidos.size() > 0)
            p.setId(dBpedidos.get(dBpedidos.size()-1).getId()+1);
        else
            p.setId(0); // primeiro registro

        dBpedidos.add(p);

    }

    public static Pedido getPedidoByMesa(Mesa m){

        return dBpedidos.stream().filter(p -> p.getMesa().equals(m.getId())).findFirst().get();

    }

    public static void fecharPedido(Pedido p){

        CaixaDao.addValorCaixa(p.getValorTotal());
        dBpedidos.removeIf(x->x.equals(p));

    }

}
