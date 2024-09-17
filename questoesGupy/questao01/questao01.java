/*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.*/


package questao01;
    import java.util.Scanner;

        public class questao01{
            public static boolean eFibonacci(int f){
                int a = 0, b = 1;
                while (a < f) {
                    int temp = a;
                    a = b;
                    b = temp + b;
                }
                return a == f;
            }

            public static void main (String [] args){
                Scanner sc = new Scanner(System.in);

                    System.out.print("Digite um numero: ");
                    int numero =  sc.nextInt();

                    if( eFibonacci(numero) ){
                        System.out.println("O numero " + numero + " pertence a sequencia de fibonacci.");
                    } else { 
                        System.out.println("O numero " + numero + " nao pertencem a sequencia de fibonacci.");
                    }
                sc.close();

            }
        }