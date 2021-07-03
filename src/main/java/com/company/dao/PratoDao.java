package com.company.dao;

import com.company.dto.PratoDto;
import com.company.model.Prato;

import static com.company.modulo6aula2ex2.Modulo6aula2ex2Application.dBpratos;

public class PratoDao {

    public static void savePrato(PratoDto prato){

        Prato p = new Prato(prato);

        if(dBpratos.size() > 0)
            p.setId(dBpratos.get(dBpratos.size()-1).getId()+1);
        else
            p.setId(0); // primeiro registro

        dBpratos.add(p);

    }

    public static Prato getPratoById(int id){

        return dBpratos.stream().filter(m -> m.equals(id)).findFirst().get();

    }


}
