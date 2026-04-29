package main;

import controller.ImpressoraBanco;
import model.ConfiguracaoSistema;

public class Main {
    public static void main(String[] args) {
        ConfiguracaoSistema c1 = new ConfiguracaoSistema();
        ImpressoraBanco.imprimeRelatorio();
        ConfiguracaoSistema c2 = new ConfiguracaoSistema();
        ConfiguracaoSistema c3 = new ConfiguracaoSistema();
        ImpressoraBanco.imprimeRelatorio();
        ConfiguracaoSistema.zeraAcessos();
        ImpressoraBanco.imprimeRelatorio();
    }
}
