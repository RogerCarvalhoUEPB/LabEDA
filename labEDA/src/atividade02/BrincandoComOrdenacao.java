package atividade02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BrincandoComOrdenacao {

	public static void main(String[] args) {
		Ordenacao_IF x = new Ordenacao();
		int t1,t2,t3;
		double aux;
		t1=2000;
		t2=7000;
		t3=12000;
		int vetor_cct []= new int [t1];
		int vetor_dct []= new int [t1];
		int vetor_rdm []= new int [t1];
		List<Integer> vetor_aux = new ArrayList<>();
		preenche_vt_cct(vetor_cct);
		preenche_vt_dct(vetor_dct);
		preenche_vt_aux(vetor_aux,t1);
		preenche_vt_rdm(vetor_aux,vetor_rdm);

		System.out.println("\n-----------------------Vetores Crescente-----------------------");
		System.out.println("\n----------------------------" + t1 + "------------------------------");

		aux = x.bubbleSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Bubble Sort \nTempo: " + aux + "s");

		aux = x.selectionSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Selection Sort \nTempo: " + aux + "s");

		aux = x.insertionSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Insertion Sort \nTempo: " + aux + "s");

		aux = x.mergeSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Merge Sort \nTempo: " + aux + "s");

		aux = x.quickSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Quick Sort \nTempo: " + aux + "s");

		aux = x.random_quickSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Random QuickSort \nTempo: " + aux + "s");

		aux = x.quickSort_Java(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: QuickSort Java \nTempo: " + aux + "s");

		aux = x.countingSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Counting Sort \nTempo: " + aux + "s");
		
		
		System.out.println("\n-----------------------Vetores Decrescente-----------------------");
		System.out.println("\n----------------------------" + t1 + "------------------------------");

		
		aux = x.bubbleSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Bubble Sort \nTempo: " + aux + "s");

		aux = x.selectionSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Selection Sort \nTempo: " + aux + "s");

		aux = x.insertionSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Insertion Sort \nTempo: " + aux + "s");

		aux = x.mergeSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Merge Sort \nTempo: " + aux + "s");

		aux = x.quickSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Quick Sort \nTempo: " + aux + "s");

		aux = x.random_quickSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Random QuickSort \nTempo: " + aux + "s");

		aux = x.quickSort_Java(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: QuickSort Java \nTempo: " + aux + "s");

		aux = x.countingSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Counting Sort \nTempo: " + aux + "s");
		
		System.out.println("\n-----------------------Vetores Random-----------------------");
		System.out.println("\n----------------------------" + t1 + "------------------------------");

		aux = x.bubbleSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Bubble Sort \nTempo: " + aux + "s");

		aux = x.selectionSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Selection Sort \nTempo: " + aux + "s");

		aux = x.insertionSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Insertion Sort \nTempo: " + aux + "s");

		aux = x.mergeSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Merge Sort \nTempo: " + aux + "s");

		aux = x.quickSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Quick Sort \nTempo: " + aux + "s");

		aux = x.random_quickSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Random QuickSort \nTempo: " + aux + "s");

		aux = x.quickSort_Java(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: QuickSort Java \nTempo: " + aux + "s");

		aux = x.countingSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Counting Sort \nTempo: " + aux + "s");
		
		vetor_cct = new int [t2];
		vetor_dct = new int [t2];
		vetor_rdm = new int [t2];
	
		preenche_vt_cct(vetor_cct);
		preenche_vt_dct(vetor_dct);
		preenche_vt_aux(vetor_aux,t2);
		preenche_vt_rdm(vetor_aux,vetor_rdm);

		System.out.println("\n-----------------------Vetores Crescente-----------------------");
		System.out.println("\n----------------------------" + t2 + "------------------------------");

		aux = x.bubbleSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Bubble Sort \nTempo: " + aux + "s");

		aux = x.selectionSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Selection Sort \nTempo: " + aux + "s");

		aux = x.insertionSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Insertion Sort \nTempo: " + aux + "s");

		aux = x.mergeSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Merge Sort \nTempo: " + aux + "s");

		aux = x.quickSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Quick Sort \nTempo: " + aux + "s");

		aux = x.random_quickSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Random QuickSort \nTempo: " + aux + "s");

		aux = x.quickSort_Java(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: QuickSort Java \nTempo: " + aux + "s");

		aux = x.countingSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Counting Sort \nTempo: " + aux + "s");
		
		
		System.out.println("\n-----------------------Vetores Decrescente-----------------------");
		System.out.println("\n----------------------------" + t2 + "------------------------------");

		
		aux = x.bubbleSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Bubble Sort \nTempo: " + aux + "s");

		aux = x.selectionSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Selection Sort \nTempo: " + aux + "s");

		aux = x.insertionSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Insertion Sort \nTempo: " + aux + "s");

		aux = x.mergeSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Merge Sort \nTempo: " + aux + "s");

		aux = x.quickSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Quick Sort \nTempo: " + aux + "s");

		aux = x.random_quickSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Random QuickSort \nTempo: " + aux + "s");

		aux = x.quickSort_Java(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: QuickSort Java \nTempo: " + aux + "s");

		aux = x.countingSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Counting Sort \nTempo: " + aux + "s");
		
		System.out.println("\n-----------------------Vetores Random-----------------------");
		System.out.println("\n----------------------------" + t2 + "------------------------------");

		aux = x.bubbleSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Bubble Sort \nTempo: " + aux + "s");

		aux = x.selectionSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Selection Sort \nTempo: " + aux + "s");

		aux = x.insertionSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Insertion Sort \nTempo: " + aux + "s");

		aux = x.mergeSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Merge Sort \nTempo: " + aux + "s");

		aux = x.quickSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Quick Sort \nTempo: " + aux + "s");

		aux = x.random_quickSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Random QuickSort \nTempo: " + aux + "s");

		aux = x.quickSort_Java(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: QuickSort Java \nTempo: " + aux + "s");

		aux = x.countingSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Counting Sort \nTempo: " + aux + "s");


		vetor_cct = new int [t3];
		vetor_dct = new int [t3];
		vetor_rdm = new int [t3];
	
		preenche_vt_cct(vetor_cct);
		preenche_vt_dct(vetor_dct);
		preenche_vt_aux(vetor_aux,t3);
		preenche_vt_rdm(vetor_aux,vetor_rdm);

		System.out.println("\n-----------------------Vetores Crescente-----------------------");
		System.out.println("\n----------------------------" + t3 + "------------------------------");

		aux = x.bubbleSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Bubble Sort \nTempo: " + aux + "s");

		aux = x.selectionSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Selection Sort \nTempo: " + aux + "s");

		aux = x.insertionSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Insertion Sort \nTempo: " + aux + "s");

		aux = x.mergeSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Merge Sort \nTempo: " + aux + "s");

		aux = x.quickSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Quick Sort \nTempo: " + aux + "s");

		aux = x.random_quickSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Random QuickSort \nTempo: " + aux + "s");

		aux = x.quickSort_Java(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: QuickSort Java \nTempo: " + aux + "s");

		aux = x.countingSort(vetor_cct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Counting Sort \nTempo: " + aux + "s");
		
		
		System.out.println("\n-----------------------Vetores Decrescente-----------------------");
		System.out.println("\n----------------------------" + t3 + "------------------------------");

		
		aux = x.bubbleSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Bubble Sort \nTempo: " + aux + "s");

		aux = x.selectionSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Selection Sort \nTempo: " + aux + "s");

		aux = x.insertionSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Insertion Sort \nTempo: " + aux + "s");

		aux = x.mergeSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Merge Sort \nTempo: " + aux + "s");

		aux = x.quickSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Quick Sort \nTempo: " + aux + "s");

		aux = x.random_quickSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Random QuickSort \nTempo: " + aux + "s");

		aux = x.quickSort_Java(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: QuickSort Java \nTempo: " + aux + "s");

		aux = x.countingSort(vetor_dct.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Counting Sort \nTempo: " + aux + "s");
		
		System.out.println("\n-----------------------Vetores Random-----------------------");
		System.out.println("\n----------------------------" + t3 + "------------------------------");

		aux = x.bubbleSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Bubble Sort \nTempo: " + aux + "s");

		aux = x.selectionSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Selection Sort \nTempo: " + aux + "s");

		aux = x.insertionSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Insertion Sort \nTempo: " + aux + "s");

		aux = x.mergeSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Merge Sort \nTempo: " + aux + "s");

		aux = x.quickSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Quick Sort \nTempo: " + aux + "s");

		aux = x.random_quickSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Random QuickSort \nTempo: " + aux + "s");

		aux = x.quickSort_Java(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: QuickSort Java \nTempo: " + aux + "s");

		aux = x.countingSort(vetor_rdm.clone());
		aux = aux / Math.pow(10, 9);
		System.out.println("\nNome: Counting Sort \nTempo: " + aux + "s");
			
	}
		
	
	public static void preenche_vt_cct(int vt []) {
		for(int i =0;i<vt.length;i++) {
			vt[i]=i;
		}
	}
	public static void preenche_vt_dct(int vt []) {
		int j = vt.length-1;
		for(int i=0;i<vt.length;i++) {
			vt[i]=j;
			j--;
		}
	}
	public static void preenche_vt_aux(List<Integer> vt,int t) {
		for(int i =(t-1);i>-1;i--) {
			vt.add(i);
		}
	}
	public static void preenche_vt_rdm(List<Integer> vt,int aux []) {
		Collections.shuffle(vt);
		for (int i= 0;i<aux.length;i++) {
            aux[i] = vt.get(i);
		}
    }
}