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

    public void adicionarHabilidade(String nomeHabilidade, String efeitoHabilidade) {
        Habilidade novaHabilidade = new Habilidade(nomeHabilidade, efeitoHabilidade);
        listaHabilidades.add(novaHabilidade);
    }

    public void removerHabilidade(String nomeHabilidade) {
        for (int x=0; x<listaHabilidades.size(); x++) {
            if (listaHabilidades.get(x).getNomeHabilidade() == nomeHabilidade) {
                listaHabilidades.remove(nomeHabilidade);
                break;
            } else {
                System.out.println("Nenhuma habilidade com esse nome foi encontrada.");
            }
        }
    }

}