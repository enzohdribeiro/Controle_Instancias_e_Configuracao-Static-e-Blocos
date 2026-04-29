package controller;

import model.ConfiguracaoSistema;

public class ImpressoraBanco {
    public static void imprimeRelatorio(){
        System.out.println("---------------------");
        System.out.println("Imprimindo relatório do banco: " + ConfiguracaoSistema.nomeBanco);
        System.out.println("Quantidade de acessos: " + ConfiguracaoSistema.getContadorAcessos());
        System.out.println("---------------------");
    }
}
