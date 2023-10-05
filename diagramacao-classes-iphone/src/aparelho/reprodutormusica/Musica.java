package aparelho.reprodutormusica;

public class Musica {

    private String titulo;
    private String artista;
    private String album;
    private int duracao;

    public Musica(String titulo, String artista, String album, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracao = duracao;
    }

    public void tocar() {
        System.out.println("Tocando música: " + titulo);
    }

    public void parar() {
        System.out.println("Pausando música: " + titulo);
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Artista: " + artista + ", Album: " + album + ", Duração: " + duracao;
    }
}
