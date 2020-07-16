package aplicacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FixacaoSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		System.out.print("How many Students for course A: ");
		Integer num = sc.nextInt();
		for (int i =  1; i <= num; i++) {
			set.add(sc.nextInt());
		}
		System.out.print("How many Students for course B: ");
		num = sc.nextInt();
		for (int i =  1; i <= num; i++) {
			set.add(sc.nextInt());
		}
		System.out.print("How many Students for course C: ");
		num = sc.nextInt();
		for (int i =  1; i <= num; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.print("Total students: " + set.size());
		
		
		sc.close();

	}

}
