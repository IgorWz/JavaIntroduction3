package exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collectionUm {

	public static void main(String[] args) {
		
		ArrayList<String> minhaLista = new ArrayList();
		
		Scanner read = new Scanner (System.in);
		
		for(int op=0; op<5; op++) {
			System.out.println("Digite uma cor de camiseta: ");
			String camisa = read.nextLine();
			
		}
		
		System.out.println("\nListar todas as cores: "+minhaLista);
		
		Collections.sort(minhaLista);
		System.out.println("\nOrdenar as cores: "+minhaLista);
	}

}
