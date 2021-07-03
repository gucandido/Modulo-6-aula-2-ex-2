package com.company.dao;

import com.company.model.Mesa;
import com.company.model.Prato;

import java.util.List;

import static com.company.modulo6aula2ex2.Modulo6aula2ex2Application.dBmesas;

public class MesaDao {

    public static void saveMesa(List<Prato> pratos){

        Mesa m = new Mesa();

        if(dBmesas.size() > 0)
            m.setId(dBmesas.get(dBmesas.size()-1).getId()+1);
        else
            m.setId(0); // primeiro registro

        dBmesas.add(m);

    }

    public static void addPratoMesa(int idMesa, Prato p){

        dBmesas.stream().filter(m -> m.equals(idMesa)).findFirst().get().addPrato(p);

    }

    public static Mesa getMesaById(int id){

        Mesa a = dBmesas.stream().filter(m -> m.equals(id)).findFirst().get();

        return a;

    }

}
