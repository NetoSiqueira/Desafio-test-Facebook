package core;

public class Propriedades {
    public static boolean FECHAR_BROWSER = false;
    public static Browsers browser = Browsers.CHROME;

    public  static String paginaInicial = "O Facebook ajuda você a se conectar e compartilhar com as pessoas que fazem parte da sua vida.";

//    public static  String NOME_CONTA_ALTERADA = "Conta Alterada" + System.nanoTime();
    public enum Browsers{
        CHROME,
        FIREFOX
    }
}
