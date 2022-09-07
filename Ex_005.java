
import java.util.Scanner;
public class Ex_005{
    public static void main(String[] args) {
        char sexo;
        double altura;
        Scanner input = new Scanner(System.in);

        System.out.println("pfv digite seu SEXO [M / F] ");
        sexo = input.next().charAt(0);
        System.out.println("pfv digite sua altura: ");
        altura = input.nextDouble();

        if(sexo == 'm'){
            System.out.println("o seu peso ideal é: " + (( 72.7 *altura)- 58));
           
        }else if (sexo == 'f') {
            System.out.println("o seu peso ideal é: " + (( 62.1 *altura)- 44.7));
            
        }else{
            System.out.println("pfv digite seu sexo");
        }input.close();
            
    


        
    }
   
    

}