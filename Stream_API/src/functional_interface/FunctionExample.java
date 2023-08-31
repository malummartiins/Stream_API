package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/* representa uma função que aceita um argumento e retorna outro tipo de resultado
 * usado para transformar ou mapear os elementos de um stream.
 */

public class FunctionExample{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //function com expressao lambda para dobras os numeros
        Function<Integer, Integer> dobras = numero -> numero * 2;

        //função para dobrar todos os nº no stream e armazenar em outra lista
        List<Integer> numerosDobrados = numeros.stream()
        .map(dobras)
        .toList();

        //imprimir a lista dobrada

        numerosDobrados.forEach(n -> System.out.println(n));

    }
}