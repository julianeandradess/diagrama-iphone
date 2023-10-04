package Funcionamento;
import Aparelho.Iphone;



public class AparelhoIphone {
    public static void main(String[] args) {
        Iphone iph = new Iphone();

        System.out.println("INTERNET");
        iph.adicionarNovaAba();
        iph.atualizarPagina();
        iph.exibirPagina();

        System.out.println("CHAMADA");
        iph.atender();
        iph.ligar();

        System.out.println("PRONTO PARA OUVIR MÚSICA?");
        iph.pausar();
        iph.selecionarMusica();
        iph.tocar();
    }
}
