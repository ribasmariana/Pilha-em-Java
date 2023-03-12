import java.util.Stack;
public class ExercicioCrisPilhaEFila2 {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("aula");
        pilha.push("de");
        pilha.push("estrutura");
        pilha.push("de");
        pilha.push("dados");

        System.out.println("Pilha: " + pilha);

        String elementoRemovido = pilha.pop();
        System.out.println("Elemento removido: " + elementoRemovido);

        String topoDaPilha = pilha.peek();
        System.out.println("Topo da pilha: " + topoDaPilha);

        pilha.push("adoro essa aula");

        pilha.clear();
        System.out.println("Pilha vazia: " + pilha);
    }
}
