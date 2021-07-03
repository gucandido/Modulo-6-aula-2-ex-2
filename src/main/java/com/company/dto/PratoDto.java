package com.company.dto;

import com.company.model.Prato;

import java.util.ArrayList;
import java.util.List;

public class PratoDto {

    private String descricao;
    private Double preco;
    private Integer quantidade;

    public PratoDto(String descricao, Double preco, Integer quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public static List<PratoDto> convertDto(List<Prato> p){

        List<PratoDto> l = new ArrayList<>();

        for (Prato prato: p) {

            l.add(new PratoDto(prato.getDescricao(), prato.getPreco(), prato.getQuantidade()));

        }

        return l;

    }

    public static List<Prato> convert(List<PratoDto> p){

        List<Prato> l = new ArrayList<>();

        for (PratoDto prato: p) {

            l.add(new Prato(prato));

        }

        return l;

    }
}
