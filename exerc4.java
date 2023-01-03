/*Exibir os cubos dos números inteiros no intervalo de
A até B. Os valores de A e B devem ser informados pelo usuário. OBS: O programa
deve garantir (forçar) que o valor de B seja maior que o valor de A. */

Scanner input = new Scanner (System.in);
		int A, B, cont;
		System.out.println("digite um número no intervalo de A");
		A = input.nextInt();
		System.out.println("digite um número no intervalo de B");
		B = input.nextInt();
		
		
		while (B <= A) {
				System.out.println("B tem que ser maior que A");
				System.out.println("digite B ");
				B = input.nextInt();
			}
			
		cont = A;
		while (cont <= B) {
			System.out.println(cont + " ^ 3 :" + Math.pow(cont, 3));
			cont = cont + 1;
		}
			
}
}

