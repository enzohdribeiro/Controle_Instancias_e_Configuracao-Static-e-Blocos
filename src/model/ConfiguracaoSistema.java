package model;

public class ConfiguracaoSistema {
    public static final String nomeBanco;
    private static int contadorAcessos;


    static{
        nomeBanco = "BANCO_DE_DADOS_YYY";
        contadorAcessos = 0;
    }

    {
        System.out.println("---------------------");
        System.out.println("Acessando o banco de dados");
        System.out.println("---------------------");
        contadorAcessos++;
    }

    public static void zeraAcessos(){
        System.out.println("Zerando a contagem de acessos...");
        contadorAcessos = 0;
    }

    public static int getContadorAcessos() {
        return contadorAcessos;
    }
}
