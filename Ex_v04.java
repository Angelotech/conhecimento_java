import java.util.Scanner;
public class Ex_v04 {
    /*.Criar um vetor A com 10 elementos inteiros. Implementar um programa 
que defina e escreva a quantidade de elementos armazenados neste 
vetor que são pares. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetora = new int[10];
        int cont = 0;
        int conts = 0;
        
            
        for(int c = 0; c <vetora.length; c++ ){
            System.out.print("pfv digite o vetor: ");
            vetora[c] = input.nextInt();
            if (vetora[c] %2 == 0) {
                cont++;
                
            } else {
                conts++;
                
            }
            
        }
        System.out.println("o numeros de vetores pares são :" + cont +" e o de impares são: " + conts );
        input.close();
       
    }
    
}
