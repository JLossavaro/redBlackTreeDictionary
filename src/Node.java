/** *************************************************
 * 2 *                                                  *
 * 3 * Júlio Cézar Lossavaro                            *
 * 4 * 2018.0743.029.4                                  *
 * 5 * Implementacão 4                                  *
 * 6 * Disciplina: Estruturas de Dados e Programação I  *
 * 7 * Professor: Ronaldo Fiorilo                       *
 * 8 *                                                  *
 * 9 ************************************************** */


import java.util.ArrayList;

enum Color {
    RED, BLACK
};

public class Node {

    char language;
    String value;
    ArrayList<String> synonyms;

    boolean hidden;
    Color color;
    Node parent;
    Node left;
    Node right;

    public Node(String value, char language) {
        this.color = Color.RED;
        this.hidden = false;
        this.language = language;
        this.value = value;
        this.synonyms = new ArrayList<String>();

    }

    //Muda a cor do nó
    public void changeColor() {
        if (this.color.equals(Color.RED)) {
            this.color = Color.BLACK;
        } else {
            this.color = Color.RED;
        }
    }

}
