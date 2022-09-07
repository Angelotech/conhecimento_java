import java.util.Scanner;
public class ex_008{
    public static void main(String[] args) {
        char letra;
        Scanner input = new Scanner (System.in);

        System.out.println("pfv digite uma letra do albafeto");
        letra = input.next().toUpperCase().charAt(0);
        
        if(letra == 'A'|| letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
            System.out.println(letra + " a sua letra é uma vogal");
        }else{
            System.out.println(letra + " é uma consoante");
        }input.close();

        
    }
}