package atividade03;

public class PilhaComLista implements Pilha_IF {
    private ListaEncadeada lista;
    final private int tam = 10;
    
    public PilhaComLista() {
        lista = new ListaEncadeada();
    }

    @Override
    public void push(Integer element) throws Exception {
        if (isFull()) {
            throw new Exception("A pilha está cheia");
        }
        lista.insert(element);
    }
    @Override
    public Integer top() throws Exception {
       return lista.valor;
    }
    @Override
    public Integer pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("A pilha está vazia");
        }
        int topElement = top();
        lista.remove(topElement);
        return topElement;
    }

   

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public boolean isFull() {
        return lista.size() == 10;
    }
}