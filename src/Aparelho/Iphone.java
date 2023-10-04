package Aparelho;

import Interfaces.AparelhoTelefonico;
import Interfaces.Navegador;
import Interfaces.ReprodutorMusical;

public class Iphone implements Navegador, ReprodutorMusical, AparelhoTelefonico {

    public void ligar() {

        System.out.println("Fazendo ligação");
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }


    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }

}
