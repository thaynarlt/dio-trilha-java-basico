package aparelho;

import aparelho.navegador.NavegadorInternet;
import aparelho.reprodutormusica.Musica;
import aparelho.reprodutormusica.ReprodutorMusical;
import aparelho.telefone.AparelhoTelefonico;

public class Main {

    public static void main(String[] args) {

        // Cria um reprodutor de música
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        // Adiciona músicas ao reprodutor
        reprodutor.adicionarMusica(new Musica("Pretty When You Cry", "Lana Del Rey", "Ultraviolence (Deluxe)", 250));
        reprodutor.adicionarMusica(new Musica("The End Of Love", "Florence + The Machine", "High As Hope", 200));
        reprodutor.adicionarMusica(new Musica("evermore (feat. Bon Iver)", "Taylor Swift", "evermore", 150));

        // Toca a primeira música
        reprodutor.tocarMusica(0);

        // Pausa a música
        reprodutor.pararMusica();

        // Pula para a próxima música
        reprodutor.pularMusica();

        // Volta para a música anterior
        reprodutor.voltarMusica();

        // Lista todas as músicas
        reprodutor.listarMusicas();

        // Cria um aparelho telefônico
        AparelhoTelefonico telefone = new AparelhoTelefonico("(11) 99999-9999");

        // Faz uma chamada
        telefone.fazerChamada("(11) 88888-8888");

        // Atende uma chamada
        telefone.atenderChamada();

        // Desliga uma chamada
        telefone.desligarChamada();

        // Cria um navegador da internet
        NavegadorInternet navegador = new NavegadorInternet("https://www.google.com");

        // Abre uma página
        navegador.abrirPagina("https://www.youtube.com");

        // Fecha a página atual
        navegador.fecharPagina();

        // Volta para a página anterior
        navegador.voltarPagina();

        // Avança para a próxima página
        navegador.avancarPagina();

    }

}
