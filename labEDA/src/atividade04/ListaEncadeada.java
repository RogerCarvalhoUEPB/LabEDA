package atividade04;
public class ListaEncadeada implements ListaEncadeada_IF {
    Integer valor;
    ListaEncadeada next;

    public ListaEncadeada() {
        valor = null;
        next = null;
    }
    public ListaEncadeada(Integer element) {
    	valor = element;
    	next = null;
    }
    @Override
    public boolean isEmpty() {
        return valor == null;
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        if (next == null) {
            return 1;
        }
        return 1 + next.size();
    }

    @Override
    public Integer search(Integer element) throws Exception {
	       if (isEmpty()) {
	           throw new Exception("Valor não encontrado");
	       }
	       if (valor.equals(element)) {
	           return valor;
	       }
	       else {
	           return next.search(element);
	       }
	   }
    public void insert(Integer element) {
        if(isEmpty()) {
            valor = element;
            next = new ListaEncadeada();
        } else {
           next.insert(element);
        }
    }
    @Override
    public void remove(Integer element) {
        if (isEmpty()) {
            return;
        }

        if (valor.equals(element)) {
            if (next != null) {
                valor = next.valor;
                next = next.next;
            } else {
                valor = null;
                next = null;
            }
        } else if (next != null) {
            next.remove(element);
        }
    }

    @Override
    public Integer[] toArray() {
    	Integer[] array = new Integer[size()];
        toArrayRecursive(this, array, 0);
        return array;
    }

    private void toArrayRecursive(ListaEncadeada node, Integer[] array, int i) {
        if (!node.isEmpty()) {
            array[i] = node.valor;
            if (node.next != null) {
                toArrayRecursive(node.next, array, i + 1);
            }
        }
    }
    public String print() {
        String saida = "";
        for (ListaEncadeada no = this; no != null; no = no.next) {
            saida += no.valor + " ";
        }
        return saida;
    }
}
