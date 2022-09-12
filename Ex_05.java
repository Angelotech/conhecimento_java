import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = 0;
        int maior = 0;
        int menor = 0;


        for(int c = 1; c < 6; c++){
            System.out.println("pfv digite 5 numeros");
            m = input.nextInt();
    
            if(m > maior){
                maior = m;
            }

        }System.out.println("o maior numero " + maior + " o menor numero " + menor);
        input.close();        
        


    
    }
    
}
