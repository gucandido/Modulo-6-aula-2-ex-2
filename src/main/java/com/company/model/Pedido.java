package com.company.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido {

    private int id;
    private Mesa mesa;
    private double valorTotal;
    private List<Prato> pratos = new ArrayList<>();

    public Pedido(Mesa mesa, List<Prato> pratos) {
        this.mesa = mesa;
        this.pratos = pratos;

        this.valorTotal = calcValorPedido();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
        this.valorTotal = calcValorPedido();
    }

    private double calcValorPedido(){

        double acc = 0.0;

        for (Prato p : this.pratos){ acc =+ p.getPreco(); }

        return acc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return id == pedido.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
