import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		int total = 0;
		int contador = 1;
				
		Scanner sc = new Scanner(System.in);
	 
		while(contador<=10){
			System.out.println("Digite a nota " + contador +":");
			int nota = sc.nextInt();
			total = total + nota;
			contador++;
		}
		int media = total/10;
		System.out.println("Media das notas: " + media);
		sc.close();
	}

}

		
	