import java.util.Scanner;
public class Ex_v02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetora = new int[15];
        int[] vetorb = new int[15];
            
        for(int c = 0; c <vetora.length; c++ ){
            System.out.print("pfv digite o vetor: ");
            vetora[c] = input.nextInt();
            vetorb[c] = vetora[c] * vetora[c];
            
        }
        for(int i = 0; i<vetora.length; i++){
            System.out.print(" " + vetorb[i]);


        }input.close();
       
    }
        
                   

     

    }


    
 


    

