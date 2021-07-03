package com.company.dto;

import com.company.model.Pedido;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class PedidoDto {

    @JsonIgnore private int idMesa;
    private List<PratoDto> pratos;
    private double totalPreco;

    public PedidoDto() {
    }

    public PedidoDto(Pedido p) {
        this.idMesa = p.getMesa().getId();
        this.pratos = PratoDto.convertDto(p.getPratos());
        this.totalPreco = p.getValorTotal();
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public List<PratoDto> getPratos() {
        return pratos;
    }

    public void setPratos(List<PratoDto> pratos) {
        this.pratos = pratos;
    }

    public double getTotalPreco() {
        return totalPreco;
    }

    public void setTotalPreco(double totalPreco) {
        this.totalPreco = totalPreco;
    }
}
