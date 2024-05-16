package atividade02;

import java.util.Arrays;
import java.util.Random;

public class Ordenacao implements Ordenacao_IF {

	@Override
	public boolean checaVetorOrdenado(int[] numeros){
		int i;
		for(i=1;i<numeros.length;i++) {
			if(numeros[i]<numeros[i-1]) {
				return false;
			}
		}
		return true;
	}

	
	@Override
	public long bubbleSort(int[] numeros){
		long antes = System.nanoTime();
		for(int k =0;k<50;k++) {
		int i,j;
		int aux=0;
		for(i=0;i<numeros.length-1;i++) {
			for(j=0;j<numeros.length-1;j++) {
				if(numeros[j]>numeros[j+1]) {
					aux=numeros[j];
					numeros[j]=numeros[j+1];
					numeros[j+1]=aux;
				}
			}
			}
		}
		long depois = System.nanoTime();
		long tempo_n = (depois - antes);
		long tempo_s = (tempo_n/50);
		return tempo_s;
	}

	
	@Override
	public long selectionSort(int[] numeros) {
		long antes = System.nanoTime();
		for(int k=0;k<50;k++) {
        for (int i=0;i<numeros.length-1;i++) {
            int z= i;
            for (int j=i+1;j<numeros.length;j++) {
                if (numeros[j]<numeros[z]) {
                    z = j;
                }
            }
            int aux= numeros[i];
            numeros[i]= numeros[z];
            numeros[z]= aux;
        }
		}
		long depois = System.nanoTime();
		long tempo_n = (depois - antes);
		long tempo_s = (tempo_n/50);
		return tempo_s;
	}
	
	
	@Override
	public long insertionSort(int[] numeros) {
		long antes = System.nanoTime();
		for(int k=0;k<50;k++) {
        for (int i=1;i<numeros.length;i++) {
            int aux=numeros[i];
            int j=i-1;
            while (j>=0&&numeros[j]>aux) {
                numeros[j+1]=numeros[j];
                j=j-1;
            }
            numeros[j+1]=aux;
        }
	}
        long depois = System.nanoTime();
		long tempo_n = (depois - antes);
		long tempo_s = (tempo_n/50);
		return tempo_s;
	}

	@Override
	public long mergeSort(int[] numeros) {
		long antes,depois;
		int i;
		antes = System.nanoTime();
		for(i=0;i<50;i++) {
			auxMergeSort(numeros.clone(),0,numeros.length);
	}
		depois = System.nanoTime();
		long tempo_n = (depois - antes);
		long tempo_s = (tempo_n/50);
		return tempo_s;
		}
	public static void auxMergeSort(int[] numeros, int esq, int dir) {
        if (esq < dir) {
            int meio = (esq + dir) / 2;

            auxMergeSort(numeros, esq, meio);
            auxMergeSort(numeros, meio + 1, dir);

            merge(numeros, esq, meio, dir);
        }
    }

    public static void merge(int[] numeros, int esq, int meio, int dir) {
        int n1 = meio	- esq + 1;
        int n2 = dir - meio;
        int i,j;
        int[] numerosEsquerda = new int[n1];
        int[] numerosDireita = new int[n2];
        for (i = 0; i < n1; i++) {
            numerosEsquerda[i] = numeros[esq + i];
        }
        for (j=0; j < n2; j++) {
            numerosDireita[j] = numeros[meio + j];
        }
        int k = esq;
        while (i < n1 && j < n2) {
            if (numerosEsquerda[i] <= numerosDireita[j]) {
                numeros[k] = numerosEsquerda[i];
                i++;
            } else {
                numeros[k] = numerosDireita[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            numeros[k] = numerosEsquerda[i];
            i++;
            k++;
        }
        while (j < n2) {
            numeros[k] = numerosDireita[j];
            j++;
            k++;
        }
    }
	@Override
	public long quickSort(int[] numeros) {
	    int i;
	    long antes, depois;
	    antes = System.nanoTime();
	    for (i = 0; i < 50; i++) {
	        auxQuickSort(numeros, 0, numeros.length - 1);
	    }
	    depois = System.nanoTime();
		long tempo_n = (depois - antes);
		long tempo_s = (tempo_n/50);
		return tempo_s;
	}

	public void auxQuickSort(int[] numeros, int esq, int dir) {
	    if (esq < dir) {
	        int piv = divisao(numeros, esq, dir);
	        if (esq < piv - 1) {
	            auxQuickSort(numeros, esq, piv - 1);
	        }
	        if (piv + 1 < dir) {
	            auxQuickSort(numeros, piv + 1, dir);
	        }
	    }
	}

	public int divisao(int[] numeros, int esq, int dir) {
	    int piv = numeros[esq];
	    int i = esq + 1, j = dir;
	    while (i <= j) {
	        while (i <= j && numeros[i] <= piv) {
	            i++;
	        }
	        while (i <= j && numeros[j] > piv) {
	            j--;
	        }
	        if (i < j) {
	            troca(numeros, i, j);
	        }
	    }
	    troca(numeros, esq, j);
	    return j;
	}

	public void troca(int[] numeros, int i, int j) {
	    int aux = numeros[i];
	    numeros[i] = numeros[j];
	    numeros[j] = aux;
	}

	@Override
	public long random_quickSort(int[] numeros) {
		long antes, depois;
		int i;
		antes = System.nanoTime();
		for(i=0;i<50;i++) {
			auxRandomQuickSort(numeros.clone(),0,numeros.length-1);}	
	
		depois = System.nanoTime();
		long tempo_n = (depois - antes);
		long tempo_s = (tempo_n/50);
		return tempo_s;
	}
	public void auxRandomQuickSort(int[] numeros, int esq, int dir) {
		int piv;
		if(esq<dir) {
			piv = divisaoAleatoria(numeros,esq,dir);
			auxRandomQuickSort(numeros, esq, piv-1);
			auxRandomQuickSort(numeros,piv+1,dir);
		}
	}
	public int divisaoAleatoria(int[] numeros, int esq, int dir) {
		Random rand = new Random();
        int indicePiv = rand.nextInt((dir - esq) + 1) + esq;
        troca(numeros, esq, indicePiv);
	    int piv = numeros[esq];
	    int i = esq + 1, j = dir;
	    while (i <= j) {
	        if (numeros[i] <= piv) {
	            i++;
	        } else if (numeros[j] > piv) {
	            j--;
	        } else {
	            troca(numeros, i, j);
	        }
	    }
	    troca(numeros, esq, j);
	    return j;
	}
		
	@Override
	public long quickSort_Java(int[] numeros) {
		long antes,depois;
		antes = System.nanoTime();
		for(int k =0;k<50;k++) {
			Arrays.sort(numeros.clone());
		}
		depois = System.nanoTime();
		long tempo_n = (depois - antes);
		long tempo_s = (tempo_n/50);
		return tempo_s;
	}

	@Override
	public long countingSort(int[] numeros) {
		int k;
		long antes,depois;
		antes = System.nanoTime();
		for(k=0;k<50;k++) {
			auxCountingSort(numeros.clone());
		}
		depois = System.nanoTime();
		long tempo_n = (depois - antes);
		long tempo_s = (tempo_n/50);
		return tempo_s;
		}


	public void auxCountingSort(int[] numeros) {
		int i;
		int max=0;
		for(i=0;i<numeros.length;i++) {
			if(numeros[i]>max) {
				max=numeros[i];
			}
		}
		int[] contagem = new int[max+1];
		for(i=0;i<numeros.length;i++) {
			contagem[numeros[i]] = contagem[numeros[i]]+1;
		}
		for(i=1;i<contagem.length;i++) {
			contagem[i]= contagem[i]+ contagem[i-1];
		}
		int[] auxOrdenado = new int[numeros.length];
		for(i=(numeros.length-1);i>0;i--) {
		    auxOrdenado[contagem[numeros[i]]-1] = numeros[i];
		      contagem[numeros[i]]--;
		}
		for(i=0;i<numeros.length;i++) {
			numeros[i] = auxOrdenado[i];
		}
	}
	}

