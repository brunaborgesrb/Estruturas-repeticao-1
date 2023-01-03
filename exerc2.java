/*Solicite ao usuário um número real que esteja na faixa
entre 1 e 9 (inclusive). Enquanto o número fornecido pelo usuário não estiver na faixa
permitida, o programa deve emitir uma mensagem avisando sobre o erro cometido (“O
valor não está dentro da faixa permitida.”) e deve solicitar ao usuário que digite um valor
dentro da faixa esperada. Quando o usuário digitar um valor permitido, o programa
deverá emitir a seguinte mensagem: “O valor está dentro da faixa permitida.” */

Scanner input = new Scanner (System.in);
     	int num;
        	System.out.println("informe um número entre 1 e 9: ");
        	num = input.nextInt();
        	while (num < 1.0 || num > 9.0){
            	System.out.println("valor não está dentro da faixa permitida.");
        	System.out.println("informe outro número entre 1 e 9: ");
     	num = input.nextInt();
        	}
    
    System.out.println("O valor está dentro da faixa permitida.");
   	 

}


    }

