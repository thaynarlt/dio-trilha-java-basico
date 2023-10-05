package aparelho.navegador;

public class NavegadorInternet {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public NavegadorInternet(String url) {
        this.url = url;
    }

    public void abrirPagina(String url) {
        System.out.println("Abrir página: " + url);
    }

    public void fecharPagina() {
        System.out.println("Fechar página");
    }

    public void voltarPagina() {
        System.out.println("Voltar página");
    }

    public void avancarPagina() {
        System.out.println("Avançar página");
    }

}
