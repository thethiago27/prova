package pedido;

import cliente.Cliente;
import produto.Produto;

import java.util.Scanner;

public class Pedido {

  public static void main(String[] args) {

    var sc = new Scanner(System.in);
    System.out.printf("Digite o id do produto: ");

    int productId = sc.nextInt();

    var produto = new Produto();

    double productAmount = produto.getProductPrice(productId);

    System.out.printf("Digite a quantidade: ");

    int quantidade = sc.nextInt();

    System.out.printf("Digite o CPF do cliente: ");

    int cpf = sc.nextInt();

    var cliente = new Cliente();

    boolean hasClient = cliente.checkHasClient(cpf);

    if(!hasClient) {
      System.out.printf("Cliente não cadastrado, pergunte o nome: ");
      var name = sc.next();

      cliente.newClient(cpf, name);
    }

    int clienteId = cliente.getClient(cpf);

    double pedidoId = 23;

    double valorDoPedido = productAmount * quantidade;

    System.out.printf(
        "Um novo pedido foi criado :) "
            + "\n Numero do Pedido: %f \n"
            + "\n Valor: %f"
            + "\n Quantidade: %d",
        pedidoId,
        valorDoPedido,
        quantidade
    );

    System.out.printf("Qual a quantidade da meta diaria: \n");
    int metaId = sc.nextInt();

    // Ai teriamos o metodo para cadastrar o pedido no sistema
    // createPedido(pedidoId, valorDoPedido, quantidade)
    // Logo apos cadastrariamos também, em uma função de avaliação
    // createRequestedAvalicacao(pedidoId)
  }

}
