package atividade03;
public class ListaEncadeada implements ListaEncadeada_IF {
    Integer valor;
    ListaEncadeada next;

    public ListaEncadeada() {
        valor = null;
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
    @Override
    public void insert(Integer element) {
	       if (isEmpty()) {
	           valor = element;
	           next = new ListaEncadeada();
	       } else {
	    	   ListaEncadeada NoAux = new ListaEncadeada();
	           NoAux.valor = valor;
	           NoAux.next = next;
	           valor = element;
	           next = NoAux;
	       }
	   }

    @Override
    public void remove(Integer element) {
        if (isEmpty()) {
            return;
        }
        if (valor.equals(element)) {
                valor = next.valor;
                next = next.next;
            
        }else {
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
}
