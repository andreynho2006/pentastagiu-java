import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
		int sum = 0;                                 // Variabila pentru a stoca suma totala
		System.out.println("Adauga un numar :  ");			
		Scanner in = new Scanner(System.in);				
		
		int numnber = in.nextInt();                  // Numarul de tip integer adaugat
        		
        for(int i = 0; i <= numnber; i++) {          // iteratie pentru a calcula suma tuturor numerelor de la 0 pana la integerul adaugat inclusiv
            sum += i;                                // la fiecare iteratie adaugam integerul la suma totala
        }
    System.out.println(sum);                        // printeaza in consola suma
	}

}
