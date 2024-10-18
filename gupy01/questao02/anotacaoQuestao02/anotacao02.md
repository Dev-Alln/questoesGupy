
---

Este programa em Java verifica a existência da letra `a` (tanto maiúscula quanto minúscula) em uma string fornecida pelo usuário e informa a quantidade de vezes que ela aparece.

```java
public static int contadorA(String str){
    int contador = 0;
    str = str.toLowerCase();
    for (char c : str.toCharArray()){
        if (c == 'a'){
            contador++;
        }
    }
    return contador;
}
```

Faço a criação do método `contadorA`, para que ele verifique dentro da string que será fornecida mais à frente, quantas letras `a` ou qualquer outra que eu defina aparecem.

Faço o declaramento do método como público e estático, que retorna um inteiro. Ele vai receber uma string `str` como parâmetro.
 
A variável `contador` vai iniciar em 0 pois ainda não foi apresentado nenhum "valor" para o `str`.

O `str = str.toLowerCase();` vai ser capaz de converter toda a string para minúsculas, garantindo que tanto `A` quanto `a` sejam tratados igualmente.
  
O `for (char c : str.toCharArray()) { ... }` vai iterar sobre cada caractere da string.
    
O `str.toCharArray()` converte a string em uma sequência de caracteres.
    
`if (c == 'a') { contador++; }` Se o caractere atual for `a`, irá adicionar o valor de mais 1 ao contador.
  
O `return contador;` vai fazer com que retorne o número total de vezes que a letra `a` apareceu.

Dentro do método `main`, fiz quase a mesma coisa do que no código da questão 1: estou criando o `Scanner`, solicitando ao usuário uma palavra ou frase, onde ele irá pegar essa string e passar para o método `contadorA`, onde vai ser verificado quantas vezes a letra que foi definida no método aparece. Após isso, ele imprime na tela a mensagem dizendo quantas vezes a letra apareceu.

```java
public static void main (String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe uma palavra/frase: ");
    String palavra = sc.nextLine();

    int contador = contadorA(palavra);
    System.out.println("A letra 'a' aparece " + contador + " vezes.");

    sc.close();
}
```

---

