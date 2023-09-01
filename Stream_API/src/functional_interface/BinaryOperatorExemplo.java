package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*representa uma operação que combina dois argumentos do tipo T
      * e retorna um resultado do mesmo tipo, é usada para realizar
      operações de reduçãp em pares de elementos, como somar
      ou combinar objetos.
      */

public class BinaryOperatorExemplo {
      public static void main(String[] args) {
            
      
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // usar binary com lambda para somar
    BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

    // binary para tomar todos os nº
    int resultado = numeros.stream()
            .reduce(0, somar);
        
     // imprimir resultados
     System.out.println("A soma dos nº é " + resultado);

    }    
} 