
# Stream API e Java

* A Streams API traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da programação funcional.

* Stream: solução para processar coleções de maneira declarativa.



## exemplo

```java
public class CarrinhoDeCompras {
  //atributos
  private List<Item> itemList;
  //construtor
  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }
  
  //método para calcular valor total dos itens utilizando o Stream API
  public double calcularValorTotal() {
    if (itemList.isEmpty()) {
      throw new RuntimeException("A lista está vazia!");
    }
    return itemList.stream_api()
        .mapToDouble(item -> item.getPreco() * item.getQuant())
        .sum();
  }
}
```

## LAMBDA 

Permitem representar interfaces funcionais de forma mais concisa.

* é uma função sem declaração, não é necessário colocar um nome, um tipo de tretorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar onde será usado.

* as funções lambda tem a mesma sintaxe definida como `argumento -> corpo`

```
pessoasPorAltura.sort(p1,p2) -> Double.compare(p1.getAltura(), p2.getAltura);

return pessoasPorAlturas;
```

## Method Reference

* permite fazer referencia a um método ou construtor de uma classe e assim indicar que ele deve ser utilizado num ponto específico do código, deixando-o mais simples e legível.

* para usar: informar uma classe ou referência seguida de "::" e o nome do método sem os parênteses no final.


