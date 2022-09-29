package livros;

public class AudioBook extends LivrosDigitais{
    //tem que apresentar o tempo de duração do livro.
    private String tempoDuracao;

    public AudioBook(String id, String titulo, String autor, int ano, String linkDownload, String tempoDuracao) {
        super(id, titulo, autor, ano, linkDownload);
        this.tempoDuracao = tempoDuracao;
    }

    public String getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(String tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

}
