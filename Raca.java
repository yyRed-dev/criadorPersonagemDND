
public class Raca {
    
    private String nomeRaca;
    private String descricaoRaca;
    private ListaHabilidades listaHabilidadesRaca;

    public Raca(String nomeRaca, String descricaoRaca, ListaHabilidades listaHabilidadesRaca) {
        this.nomeRaca = nomeRaca;
        this.descricaoRaca = descricaoRaca;
        this.listaHabilidadesRaca = listaHabilidadesRaca;
    }

    public String getNomeRaca() {
        return this.nomeRaca;
    }
    public String getDescRaca() {
        return this.descricaoRaca;
    }

    public void setNomeRaca(String nomeRaca) {
        this.nomeRaca = nomeRaca;
    }
    public void setDescRaca(String descricaoRaca) {
        this.descricaoRaca = descricaoRaca;
    }

    public void mostrarRaca() {
        System.out.println("Especie: " +this.getNomeRaca()+ "\n" +this.getDescRaca() );
        listaHabilidadesRaca.imprimirListaHabilidades();
    }

}