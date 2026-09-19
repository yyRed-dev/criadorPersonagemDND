import java.util.ArrayList;

public class ListaHabilidades {
    
    private ArrayList<Habilidade> listaHabilidades = new ArrayList<Habilidade>();

    public ListaHabilidades(ArrayList<Habilidade> listaHabilidades) {
        this.listaHabilidades = listaHabilidades;
    }

    public Habilidade buscarPorNome(String nome) {

        for (Habilidade habilidade : listaHabilidades) {
            if (habilidade.getNomeHabilidade().equalsIgnoreCase(nome)) {
                return habilidade;
            }
        }
        return null;
    }

    public void imprimirListaHabilidades() {
        for (Habilidade habilidade : listaHabilidades) {
            System.out.println(habilidade);
        }
    }

}