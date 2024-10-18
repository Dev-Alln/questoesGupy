
---
Este programa em Java calcula a soma dos números de 2 até 12 utilizando uma estrutura de repetição while. No final, ele imprime o valor total da soma.

```java
public class SomaIndices {
    public static void main(String[] args) {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor final de SOMA é: " + SOMA);
    }
}
```


O `INDICE` é definido como 12. Este é o número até onde vai ser somado.
A `SOMA` começa em 0. Aqui vamos guardar a soma dos números.
O `K` começa em 1. Este é o nosso contador.

O programa vai verifica se `K` é menor que `INDICE` (12).
Enquanto essa condição for verdadeira, ele repete os passos dentro do laço.

Incrementa K: K = K + 1;
Aumenta o valor de K em 1.
Atualiza SOMA: SOMA = SOMA + K;
Adiciona o novo valor de K à variável SOMA.

O laço repete até que K seja igual 12. Quando K chega 12, a condição K < INDICE não é mais verdadeira, então o laço para.

Após sair do laço, o programa imprime o valor final de SOMA na tela.
---
