package com.company.orientacao_a_objetos._11_4_introducao_ao_stream.dao;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> bucarTodasFaturas(){                  //metodo
        //Obviamente voce buscaria isso no banco de dados...

        List<Fatura> faturas = new ArrayList<>();              //// criando uma variavel fatura da classe arraylist
        Fatura.add(new Fatura( "glaucia@gmail.com", 350.0));
        Fatura.add(new Fatura( "maria@gmail.com", 150.0));
        Fatura.add(new Fatura( "jose@gmail.com", 290.0));

        return faturas;
    }
}
