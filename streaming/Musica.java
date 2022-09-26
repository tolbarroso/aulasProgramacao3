package geral;

public class Musica extends Audio{
    private String nomeDaMusica;
    private int anoDaMusica;
    private int duracao;
    private String artista;
    private String tipoDeMusica;
    
    private Artista art;

    public Musica(String nomeDaMusica, int anoDaMusica, int duracao, String artista, String tipoDeMusica) {
        this.nomeDaMusica = nomeDaMusica;
        this.anoDaMusica = anoDaMusica;
        this.duracao = duracao;
        this.artista = artista;
        this.tipoDeMusica = tipoDeMusica;
    }

    public String getNomeDaMusica() {
        return nomeDaMusica;
    }

    public void setNomeDaMusica(String nomeDaMusica) {
        this.nomeDaMusica = nomeDaMusica;
    }

    public int getAnoDaMusica() {
        return anoDaMusica;
    }

    public void setAnoDaMusica(int anoDaMusica) {
        this.anoDaMusica = anoDaMusica;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTipoDeMusica() {
        return tipoDeMusica;
    }

    public void setTipoDeMusica(String tipoDeMusica) {
        this.tipoDeMusica = tipoDeMusica;
    }

    @Override
    public String toString() {
        return "ano: " + this.anoDaMusica +  " artista: " + this.artista + " nome da música: " + this.nomeDaMusica + " duração: " + this.duracao + " gênero: " + this.tipoDeMusica; 
    }
    
    
    
    public void proximo(){
        
    }
    
    public void anterior(){
        
    }
    
    public void curtir(){
        
    }
    
}
