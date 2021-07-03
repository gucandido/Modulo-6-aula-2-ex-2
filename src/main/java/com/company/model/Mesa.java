package com.company.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mesa {

    private int id;
    private List<Prato> pratos = new ArrayList<>();
    private double totalPreco;

    public Mesa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public void addPrato(Prato p){
        this.pratos.add(p);
        this.totalPreco = calcValorTotal();
    }

    public double getTotalPreco() {
        return totalPreco;
    }

    public void setTotalPreco(double totalPreco) {
        this.totalPreco = totalPreco;
    }

    private double calcValorTotal(){

        double acc = 0.0;

        for (Prato p : this.pratos){ acc =+ p.getPreco(); }

        return acc;
    }

    @Override
    public boolean equals(Object o) {
        return this.id == ((Integer) o).intValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
