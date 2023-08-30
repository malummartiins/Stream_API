package functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemplo {

    /*Representa uma operação que não aceita nenhum
     * argumento e retorna um resultado do tipo T.
     * É comumento usada para criar ou fornecer novos 
     * objetos de um determinado tipo.
     */

    public static void main(String[] args) {
        //usar o supplier com expressão lambda para fornecer oi personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        //supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
            .limit(5)
            .collect(Collectors.toList());

            //imprimir
            listaSaudacoes.forEach(s -> System.out.println(s));
    }

}
