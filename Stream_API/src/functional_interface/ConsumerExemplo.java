package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*consumer = representa uma operação que aceita um argumento de qualquer tipo
 * e não retorna nenhum resultado. É utilizada para realizar ações, ou
 * efeitos colaterais nos elementos do Stream sem modificar ou retornar valor.
 */

public class ConsumerExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Consumer com expressao lambda para imprimir nº pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // imprimir os nº pares no stream =forEach=
        numeros.stream().forEach(imprimirNumeroPar);
    }
}
