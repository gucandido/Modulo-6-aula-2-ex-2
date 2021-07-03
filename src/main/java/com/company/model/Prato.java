package com.company.model;

import com.company.dto.PratoDto;

import java.util.Objects;

public class Prato {

    private int id;
    private double preco;
    private String descricao;
    private int quantidade;

    public Prato(double preco, String descricao, int quantidade) {
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Prato(PratoDto p) {
        this.preco = p.getPreco();
        this.descricao = p.getDescricao();
        this.quantidade = p.getQuantidade();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prato prato = (Prato) o;
        return id == prato.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
