/*Solicitar ao usuário que informe um número inteiro N
maior ou igual a dez. O programa deve garantir (forçar) a digitação de um número válido.
De posse de um número válido, o programa deve exibir todos os números inteiros de 1
até N.
Exemplo: Suponha que o usuário digite 15. Os números que serão exibidos pelo
programa serão 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 */

Scanner input = new Scanner (System.in);
    	int num, aux;
    	System.out.println("informe um número a partir de 10");
	num = input.nextInt();
  while (num < 10){
	System.out.println("número inválido");
	System.out.print("digite outro número inteiro e maior ou " + " igual a 10");
	num = input.nextInt();
  }
  if (num >= 10){
	System.out.println("número válido");
  }
    
aux = 0;
while (aux != num) {
    aux =aux + 1;
    System.out.print("núm " + aux);
}

    }

}
