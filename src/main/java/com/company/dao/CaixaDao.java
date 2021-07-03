package com.company.dao;

import static com.company.modulo6aula2ex2.Modulo6aula2ex2Application.dBvalorCaixa;

public class CaixaDao {

    public static double getValorCaixa(){
        return dBvalorCaixa;
    }

    public static void addValorCaixa(double v){
        dBvalorCaixa += v;
    }

}
