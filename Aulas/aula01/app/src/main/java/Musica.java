public class Musica {
    private int id;
    private String nome;
    private int duracao;


    public Musica(int id, String nome, int duracao){
        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}

