package atividade01;

public class Busca implements Busca_IF {

	@Override
	public int[] geraVetorNumericoOrdenado(int tamanho) {
		int[] vetor = new int[tamanho];
		int i;
		for(i=0;i<tamanho;i++) {
			vetor[i]=i+1;
		}
		return vetor;
	}
	@Override
	public boolean buscaLinear_iterativa(int[] numeros, int k) {
		int i;
		for(i=0;i<numeros.length;i++) {
			if(numeros[i]==k) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean buscaLinear_recursiva(int[] numeros, int k) {
		int i = 0;
		return auxiliarParaBuscaLinearRecursiva(numeros,k,i);
	}

	@Override
	public boolean buscaBinaria_iterativa(int[] numeros, int k) {
		int esquerda = 0;
		int direita = numeros.length-1;
		int meio;
		while(esquerda<=direita) {
			meio = (esquerda+direita)/2;
			if(k==numeros[meio]) {
				return true;
			}else if(k>numeros[meio]) {
				esquerda = meio+1;
			}else if(k<numeros[meio]) {
				direita = meio-1;
			}
		}return false;
	}

	@Override
	public boolean buscaBinaria_recursiva(int[] numeros, int k) {
		int esquerda = 0;
		int direita = numeros[numeros.length-1];
		return auxiliarParaBuscaBinariaRecursiva(esquerda,direita,numeros,k);
	}
	public boolean auxiliarParaBuscaBinariaRecursiva(int esquerda, int direita, int[]numeros,int k) {
		int meio = (esquerda+direita)/2;
		if(esquerda<=direita){
			if(k==numeros[meio]) {
			return true;
		}else if(k>numeros[meio]) {
			auxiliarParaBuscaBinariaRecursiva(meio+1,direita,numeros,k);
		}else if(k<numeros[meio]) {
			auxiliarParaBuscaBinariaRecursiva(esquerda,meio-1,numeros,k);
			}
		}return false;
	}
	public boolean auxiliarParaBuscaLinearRecursiva(int[] numeros, int k, int i) {
		if(i<numeros.length){
			if(numeros[i]==k){
				return true;
		}else {
			return auxiliarParaBuscaLinearRecursiva(numeros,k,i+1);
		}
	}
		return false;
	
}

@Override
public boolean buscaLinear_iterativa_duasPontas(int[] numeros, int k) {
	int i=0;
	int j = numeros.length-1;
	while(i<=j) {
		if(numeros[i]==k||numeros[j]==k) {
			return true;
		}else{
			i++;
			j--;}
	}
	return false;
	}
}