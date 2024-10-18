/*Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.*/


package questao02;
    import java.util.Scanner;

        public class questao02 {
            public static int contadorA(String str){
                int contador = 0;
                str = str.toLowerCase();
                for (char c : str.toCharArray()){
                    if (c ==  'a'){
                        contador++;
                    }
                }
                return contador;
            }

            public static void main (String [] args){
                Scanner sc = new Scanner(System.in);

                    System.out.print("Informe uma palavra/frase: ");
                    String palavra = sc.nextLine();

                    int contador = contadorA(palavra);
                    System.out.println("A letra 'a' aparece " + contador + " vezes.");

                    sc.close();
            }

        }
