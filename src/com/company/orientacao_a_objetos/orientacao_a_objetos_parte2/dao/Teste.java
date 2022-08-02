package com.company.orientacao_a_objetos._11_4_introducao_ao_stream.dao;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Fatura> faturas = new FaturaDAO().bucarTodasFaturas();   // buscar e um metodo de instacia

      /*  for (Fatura f : faturas) {
            if (f.getValor() >250.0){
                System.out.println(" alerta: fatura acima de R$250.0 -> " + f);

            }
        }*/

        faturas.stream()
                .filter(Fatura::estaEmRiscos)
                .forEach(System.out::println);
    }
}
