import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Habilidade> habPaladino = new ArrayList<>();
        habPaladino.add(new Habilidade("Sentido Divino", "Detecta criaturas malignas."));
        habPaladino.add(new Habilidade("Imposição das Mãos", "Cura pontos de vida."));

        Classe paladino = new Classe("Paladino", "Um guerreiro poderoso que extrai força de sua fé.");

        ArrayList<Habilidade> habHumano = new ArrayList<>();
        habHumano.add(new Habilidade("Versatilidade", "Pode se adaptar a diversas situações."));

        Raca humano = new Raca("Humano", "Uma espécie versátil e adaptável.", new ListaHabilidades(habHumano));

        Personagem personagem = new Personagem("Eliot", "Gabriel", 1, paladino, humano);

        personagem.mostraPersonagem();
    }
}