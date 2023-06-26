package javapilha;
public class Conexao implements AutoCloseable {
  
  public Conexao() {
    System.out.println("abrindo conexão");
  }

  public void leDados() {
    System.out.println("recebendo dados");
    throw new IllegalStateException(); //
  }

  @Override
  public void close() {
    System.out.println("Fechando conexão");
    //throw new UnsupportedOperationException("Unimplemented method 'close'");
  }
}
