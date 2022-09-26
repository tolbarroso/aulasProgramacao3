package geral;

public class PodCast extends Audio{
    private String nomeDoPodcast;
    private int anoDoPodcast;
    private int duracaoDoPodcast;
    private String timeDoPodcast;
    private String generoDoPodcast;

    public PodCast(String nomeDoPodcast, int anoDoPodcast, int duracaoDoPodcast, String timeDoPodcast, String generoDoPodcast) {
        this.nomeDoPodcast = nomeDoPodcast;
        this.anoDoPodcast = anoDoPodcast;
        this.duracaoDoPodcast = duracaoDoPodcast;
        this.timeDoPodcast = timeDoPodcast;
        this.generoDoPodcast = generoDoPodcast;
    }

    public String getNomeDoPodcast() {
        return nomeDoPodcast;
    }

    public void setNomeDoPodcast(String nomeDoPodcast) {
        this.nomeDoPodcast = nomeDoPodcast;
    }

    public int getAnoDoPodcast() {
        return anoDoPodcast;
    }

    public void setAnoDoPodcast(int anoDoPodcast) {
        this.anoDoPodcast = anoDoPodcast;
    }

    public int getDuracaoDoPodcast() {
        return duracaoDoPodcast;
    }

    public void setDuracaoDoPodcast(int duracaoDoPodcast) {
        this.duracaoDoPodcast = duracaoDoPodcast;
    }

    public String getTimeDoPodcast() {
        return timeDoPodcast;
    }

    public void setTimeDoPodcast(String timeDoPodcast) {
        this.timeDoPodcast = timeDoPodcast;
    }

    public String getGeneroDoPodcast() {
        return generoDoPodcast;
    }

    public void setGeneroDoPodcast(String generoDoPodcast) {
        this.generoDoPodcast = generoDoPodcast;
    }

    @Override
    public String toString() {
        return "ano: " + this.anoDoPodcast +  " time: " + this.timeDoPodcast + " título: " + this.nomeDoPodcast + " duração: " + this.duracaoDoPodcast + " gênero: " + this.generoDoPodcast;
    }
    public void alterarVelocidade() {

    }
}
