package atividade04;

import java.util.LinkedList;
import java.util.Queue;

public class BST implements BST_IF {
	Integer valor;
	BST esq;
	BST dir;
	public BST(){
	}
	public BST(Integer valor){
		this.valor = valor;
	}
	
	@Override
	public void insert(Integer element) {
		if(isNull()) {
			setValor(element);
		}else if(element<valor) {
			if(isNull(esq)) {
				esq = new BST(element);
			}else {
				esq.insert(element);
}
		}else if(element>valor) {
				if(isNull(dir)) {
					dir = new BST(element);
				}else {
					dir.insert(element);
				}
	}
}
	@Override
	public Integer search(Integer element) throws Exception {
		if(isNull()) {
			throw new Exception("Árvore vazia");
		}else if(element == valor) {
			return valor;
		}else if(element < valor) {
			return esq.search(element);
		}else {
			return dir.search(element);
		}
	}
	@Override
	public Integer[] preOrder() {
	    ListaEncadeada minhaLista = new ListaEncadeada();
	    preOrderAux(minhaLista);
	    Integer[] aux = minhaLista.toArray();
	    return aux;
	}

	public void preOrderAux(ListaEncadeada lista) {
	    if (!isNull()) {
	        lista.insert(valor);

	        if (esq != null) {
	            esq.preOrderAux(lista);
	        }

	        if (dir != null) {
	            dir.preOrderAux(lista);
	        }
	    }
	}
	@Override
	public Integer[] order() {
	    ListaEncadeada minhaLista = new ListaEncadeada();
	    orderAux(minhaLista);
	    Integer[] aux = minhaLista.toArray();
	    return aux;
	}

	private void orderAux(ListaEncadeada lista) {
	    if (!isNull()) {
	        if (esq != null) {
	            esq.orderAux(lista);
	        }

	        lista.insert(valor);

	        if (dir != null) {
	            dir.orderAux(lista);
	        }
	    }
	}
	@Override
	public Integer[] postOrder() {
	    ListaEncadeada minhaLista = new ListaEncadeada();
	    postOrderAux(minhaLista);
	    Integer[] aux = minhaLista.toArray();
	    return aux;
	}

	private void postOrderAux(ListaEncadeada lista) {
	    if (!isNull()) {
	        if (esq != null) {
	            esq.postOrderAux(lista);
	        }

	        if (dir != null) {
	            dir.postOrderAux(lista);
	        }

	        lista.insert(valor);
	    }
	}
	@Override
	public boolean isComplete() {
	    if (isNull()) {
	        return true;
	    }

	    Queue<BST> queue = new LinkedList<>();
	    queue.add(this);

	    while (!queue.isEmpty()) {
	        BST currentNode = queue.poll();

	        if (currentNode == null) {
	            while (!queue.isEmpty()) {
	                if (queue.poll() != null) {
	                    return false;
	                }
	            }
	            return true;
	        }

	        queue.add(currentNode.esq);
	        queue.add(currentNode.dir);
	    }

	    return true;
	}
	public int size() {
		if(isNull()) {
			return 0;
		}
		return 1+ esq.size() + dir.size();
	}
	public boolean isNull() {
		return valor == null;
	}
	public boolean isNull(BST arvore) {
		return arvore == null;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public BST getEsq() {
		return esq;
	}
	public void setEsq(BST esq) {
		this.esq = esq;
	}
	public BST getDir() {
		return dir;
	}
	public void setDir(BST dir) {
		this.dir = dir;
	}
	
}
