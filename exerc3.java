/*Solicitar ao usuário que digite números inteiros
positivos ou negativos. A quantidade de números que o usuário irá digitar não é
previamente determinada. O programa vai parar de solicitar números ao usuário quando
for digitado o número zero. Ao encerrar a entrada de dados, o programa deverá exibir
quantos dos números informados pelo usuário eram pares, ou seja, eram divisíveis por
2. */

Scanner input = new Scanner (System.in);
		int num = 0, cont = 0;
		System.out.println("digite um número");
		num = input.nextInt();
		while (num != 0) {
			if (num % 2 == 0) {
				cont = cont + 1;
				System.out.println("o número " + num + " é par");
			}
			else {
			System.out.println("o número " + num + " é impar");
		}
			System.out.println("digite outro número diferente de zero");
			num = input.nextInt();
		}
		System.out.println("você digitou " + cont + " números pares");
	}

}
