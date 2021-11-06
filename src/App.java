import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10]; // vetor que recebe 10 valores
        int i, k = 0; // Contadores
        int a = 0; // contador do vetor rep
        int w, g;
        int[] rep = new int[10];

        // entrada 10 valores
        System.out.println("Digite 10 valores: ");
        for (i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt(); 
            
        }

        // checagem repetidos
        System.out.println("Número repetidos:");

        for (i = 0; i < 10; i++) {
            for (k = 0; k < 10; k++) {
                g = 0;
                if (vetorA[i] == vetorA[k] && i != k) {
                    for (w = 0; w < 10; w++) {
                        if (rep[w] == vetorA[k]) {
                            g = 1;
                        }
                    }
                    if (g == 0) {
                        rep[a] = vetorA[i];
                        a++;
                    }
                }
            }

        }
        for (i = 0; i < a; i++) {
            System.out.println(rep[i]);
        }

       

    }
    
}