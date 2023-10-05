package aparelho.reprodutormusica;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {

    private List<Musica> musicas;

    public ReprodutorMusical() {
        musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void tocarMusica(int index) {
        if (index < musicas.size()) {
            musicas.get(index).tocar();
        }
    }

    public void pararMusica() {
        musicas.get(musicas.size() - 1).parar();
    }

    public void pularMusica() {
        if (musicas.size() > 1) {
            musicas.remove(musicas.size() - 1);
        }
    }

    public void voltarMusica() {
        if (musicas.size() > 1) {
            musicas.add(musicas.get(0));
        }
    }

    public void listarMusicas() {
        for (Musica musica : musicas) {
            System.out.println(musica);
        }
    }

}
