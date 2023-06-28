package javapilha;

public class TesteConexao {
    public static void main(String[] args) {

      try (Conexao conex = new Conexao()){
        conex.leDados();
      } catch(Exception ex) {
        System.out.println("Deu erro naconexão.");
      }

      //refatorando
      //----------------------------//
      // Conexao con = null;
      // try {
      //   con = new Conexao();
      //   con.leDados();
        
      // } catch (Exception e) {
      //     System.out.println("Deu erro naconexão.");
      // }finally {
      //   con.close();
      // }

    } 
}
