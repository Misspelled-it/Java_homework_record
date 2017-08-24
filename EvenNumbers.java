package test.javapro;

import java.util.*;

public class EvenNumbers {
	ArrayList<Integer> A1;
	ArrayList<Integer> A2;
	
	public EvenNumbers() {
		A1 = new ArrayList<Integer>();
		A2 = new ArrayList<Integer>();
	}
	public List<Integer> storeEvenNumbers(int N){
		for(int i=2; i<=N; i+=2) {
			this.A1.add(i);
		}
		
		return this.A1;
	}
	public List<Integer>printEvenNumbers(){
		for(Integer b:A1) {
			System.out.println(b*2);
			this.A2.add(b*2);
		}
		return A2;
	}
	public int retrieveEvenNumber(int N) {
		for(Integer b:A1) {
			if(b==N) {
				return b;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		EvenNumbers list = new EvenNumbers();
		list.storeEvenNumbers(17);
		list.printEvenNumbers();
		System.out.println(list.retrieveEvenNumber(80));
		
	}
}
