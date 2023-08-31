package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* representa uma função que aceita um argumento do tipo T e retorna um
 * valor booleano. Usada para filtrar os elementos do stream
 */

public class PredicateExemplo{
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java","kotlin", "python", "javascript", "c", "go", "ruby");

        //criar um predicate que verifica se as palavras tem +de 5 letras

        Predicate<String> maisDeCincoLetras= palavra -> palavra.length() > 5;
        
        palavras.stream()
            .filter(maisDeCincoLetras)
            .forEach(System.out :: println);
    
    }
}
