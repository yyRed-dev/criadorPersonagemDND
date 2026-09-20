public class Classe {
    
    private String nomeClasse;
    private int nivelClasse;
    private String descricaoClasse;
    private ListaHabilidades listaHabilidadesClasse;

    public Classe(String nomeClasse, String descricaoClasse) {
        this.nomeClasse = nomeClasse;
        this.descricaoClasse = descricaoClasse;
        this.listaHabilidadesClasse = listaHabilidadesClasse;
    }

    public String getNomeClasse() {
        return this.nomeClasse;
    }
    public int getNivelClasse() {
        return this.nivelClasse;
    }
    public String getDescricaoClasse() {
        return this.descricaoClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }
    public void setNivelClasse(int nivelClasse) {
        this.nivelClasse = nivelClasse;
    }
    public void setDscricaoClasse(String descricaoClasse) {
        this.descricaoClasse = descricaoClasse;
    }

    public void mostrarClasse() {
        System.out.println("Classe: " +this.getNomeClasse()+ "\nDescicao: " + this.getDescricaoClasse() );
        listaHabilidadesClasse.imprimirListaHabilidades();
    }

}