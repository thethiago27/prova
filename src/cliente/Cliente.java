package cliente;

public class Cliente {

  private int idCliente;
  private String nome;
  private int cpf;

  public boolean checkHasClient(
      int cpf
  ) {
    return false;
  }

  public int getClient(int cpf) {
    return 10;
  }

  public void newClient(
      int cpf,
      String nome
  ) {
    System.out.printf("Novo cliente %s cadastrado\n", nome);
  }

}
