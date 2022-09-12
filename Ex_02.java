//* Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações. 

import java.util.Scanner;
public class Ex_02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String login;
        String senha;
        boolean forma = false;

        do {
            System.out.println("pfv digite seu login (apenas letras)");
            login = input.nextLine();
            System.out.println("pfv digite sua senha");
            senha = input.nextLine();

            if (login.equalsIgnoreCase(senha)) {
            
                System.out.println("errado");  
            } else {
                System.out.println("certos");
                forma = true;
            }
            
        } while (!forma);
        input.close();

        
        
    }
}