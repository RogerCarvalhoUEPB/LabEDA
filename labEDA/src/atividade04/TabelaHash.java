package atividade04;

public class TabelaHash implements TabelaHash_IF {
	int tam;
	ListaEncadeada[] hash;
	TabelaHash(int i) {
		tam = i;
		hash = new ListaEncadeada[i];
	}
	@Override
	public void insert(Integer element) {
	    int index = element % tam;

	    if (hash[index] == null) {
	        hash[index] = new ListaEncadeada();
	    }

	    hash[index].insert(element);
	}
	@Override
	public void remove(Integer element) throws Exception {
		hash[element%tam].remove(element);

	}

	@Override
	public int search(Integer element) throws Exception {
		return  hash[element%tam].search(element);
	}

	@Override
	/*public String print() {
	    StringBuilder saida = new StringBuilder();
	    for (int i = 0; i < tam; i++) {
	        saida.append(i).append(": ");
	        if (hash[i] != null) {
	            saida.append(hash[i].print());
	        }
	        saida.append("\n");
	    }
	    return saida.toString();
	}*/
	public String print() {
		int i,j;
		Integer[] aux;
		StringBuilder saida = new StringBuilder();
		for(i=0;i<tam;i++) {
			if(hash[i]!=null) {
				aux = hash[i].toArray();
				saida.append(i).append(":");
				for(j=(aux.length-1);j>-1;j--) {
					saida.append(" ").append(aux[j]);
					if(j!=0) {
						saida.append(",");
					}
				}saida.append("\n");
			}
		}
		return saida.toString();
	}
}

