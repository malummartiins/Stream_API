
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



