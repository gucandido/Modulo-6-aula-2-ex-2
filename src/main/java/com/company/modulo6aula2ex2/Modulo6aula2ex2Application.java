package com.company.modulo6aula2ex2;

import com.company.model.Mesa;
import com.company.model.Pedido;
import com.company.model.Prato;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Modulo6aula2ex2Application {

    public static List<Mesa> dBmesas = new ArrayList<>();
    public static List<Prato> dBpratos = new ArrayList<>();
    public static List<Pedido> dBpedidos = new ArrayList<>();
    public static double dBvalorCaixa = 0;

    public static void main(String[] args) {

        SpringApplication.run(Modulo6aula2ex2Application.class, args);

        dBmesas.add(new Mesa());
        dBmesas.add(new Mesa());
        dBmesas.add(new Mesa());


    }





}
