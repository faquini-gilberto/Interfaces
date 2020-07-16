package aplicacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FixacaoSet2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> lista = new HashSet<>();
		Set<Integer> listb = new HashSet<>();
		Set<Integer> listc = new HashSet<>();
		
		System.out.print("How many Students for course A: ");
		Integer num = sc.nextInt();
		for (int i =  1; i <= num; i++) {
			lista.add(sc.nextInt());
		}
		System.out.print("How many Students for course B: ");
		num = sc.nextInt();
		for (int i =  1; i <= num; i++) {
			listb.add(sc.nextInt());
		}
		System.out.print("How many Students for course C: ");
		num = sc.nextInt();
		for (int i =  1; i <= num; i++) {
			listc.add(sc.nextInt());
		}
		
		Set<Integer> total = new HashSet<>(lista);
		total.addAll(listb);
		total.addAll(listc);
		
		
		System.out.print("Total students: " + total.size());
		
		
		sc.close();

	}

}
