package exercicio3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class collectionDois {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		Set<Integer> num = new HashSet<Integer>();
		
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		int x = read.nextInt();
		
		boolean verifica;
		
		verifica = num.contains(x);
		
		if(verifica == true) {
			System.out.println("\nO número "+x+" foi encontrado!");
		}else {
			System.out.println("\nO número "+x+" não foi encontrado!");
		}

	}

}
