public class Habilidade {
    
    private String nomeHabilidade;
    private String efeitoHabilidade;

    public Habilidade(String nomeHabilidade, String efeitoHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
        this.efeitoHabilidade = efeitoHabilidade;
    }

    public String getNomeHabilidade() {
        return this.nomeHabilidade;
    }
    public String getEfeitoHabilidade() {
        return this.efeitoHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }
    public void setEfeitoHabilidade(String efeitoHabilidade) {
        this.efeitoHabilidade = efeitoHabilidade;
    }

    @Override 
    public String toString() {
       return "Nome:" +this.getNomeHabilidade()+ ".\nEfeito: " +this.getEfeitoHabilidade()+".\n";
    }
    
}