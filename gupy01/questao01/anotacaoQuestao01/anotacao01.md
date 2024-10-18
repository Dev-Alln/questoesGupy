
---
Escolhi a linguagem de programação Java, pois é a linguagem com a qual estou tendo contato na faculdade. Entretanto, tenho um pequeno conhecimento em C e Python.

```java
public static boolean eFibonacci(int f){
    int a = 0, b = 1;
    while (a < f) {
        int temp = a;
        a = b;
        b = temp + b;
    }
    return a == f;
}
```

Nessa primeira parte do código, utilizo um método capaz de verificar se o número informado pertence ou não à sequência. Sequência essa a Fibonacci. Fibonacci, como mencionado no enunciado, é uma sequência de números em que cada um é a soma dos dois números anteriores. A sequência começa com 0 e 1, como foi definida em:

```java
    int temp = a;
    a = b;
    b = temp + b;
```

A variável `temp` que está sendo utilizada é responsável por armazenar o valor atual de `a` antes que `a` seja utilizada para o próximo número da sequência. Isso é necessário porque, logo em seguida, o valor de `a` será atualizado para `b`, e precisamos preservar o valor original de `a` para calcularmos o próximo número da sequência.

Tudo isso dentro do laço `while`, que vai ficar verificando se `a` será menor que o número definido posteriormente.

```java
while (a < f) {
    int temp = a;
    a = b;
    b = temp + b;
}
```

O laço continua executando enquanto `a` for menor que o número `f` informado pelo usuário.

Após isso, ele verifica se `a` é igual a `f`. Se for igual, retorna `true`, indicando que pertence à sequência Fibonacci; caso contrário, retorna `false`.

Dentro do método `main`, criamos o `Scanner` e solicitamos ao usuário que informe o número para saber se é ou não Fibonacci. Esse número fica armazenado na variável `numero`, que será passada para o método `eFibonacci` para verificar se pertence ou não à sequência.

```java
public static void main (String [] args){
    Scanner sc = new Scanner(System.in);    /* Criação do Scanner */

    System.out.print("Digite um número: "); /* Solicitação do número para o usuário */
    int numero = sc.nextInt();

    if( eFibonacci(numero) ){               /* Verificação se o número é ou não Fibonacci */

        System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
    } else { 
        System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
    }
    sc.close();
}
```

Essa variável `numero` toma a posição do `f` dentro do método `eFibonacci`. Caso o número seja da sequência, aparecerá na tela a mensagem indicando que ele pertence à sequência; caso contrário, aparecerá que não pertence à sequência.

---