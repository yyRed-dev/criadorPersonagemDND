public class Personagem {

    private String nomePersonagem;
    private String nomeJogador;
    private int nivelPersonagem;
    private Classe classe;
    private Raca raca;

    public Personagem(String nomePersonagem, String nomeJogador, int nivelPersonagem, Classe classe, Raca raca) {
        this.nomePersonagem = nomePersonagem;
        this.nomeJogador = nomeJogador;
        this.nivelPersonagem = nivelPersonagem;
        this.classe = classe;
        this.raca = raca;
    }

    public String getNomePersonagem() {
        return this.nomePersonagem;
    }
    public String getNomeJogador() {
        return this.nomeJogador;
    }
    public int getNivelPersonagem() {
        return this.nivelPersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    public void setNivelPersonagem(int nivelPersonagem) {
        this.nivelPersonagem = nivelPersonagem;
    }

    public void mostraPersonagem() {
        System.out.println("Nome: " +this.getNomePersonagem()+ " | Jogador: " +this.getNomeJogador() );
        System.out.println("Classe: " +this.classe.getNomeClasse() + " " + this.getNivelPersonagem());
        System.out.println("Especie: " + this.raca.getNomeRaca() );
    }

}