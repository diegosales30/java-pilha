package javapilha;

public class FluxoComErro {
  public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
           metodo1(); 
        } catch  (NullPointerException | ArithmeticException | MinhaExcecao e) { //(Exception e)
            String msdErro = e.getMessage();
            System.out.println("exception " + msdErro);
            e.printStackTrace(); //pega o caminho percorrido pelo erro nas pilhas.
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    //classe checked, extend direto da exception //ou passo throws MinhaExcecao ou faço try catch
    private static void metodo2() throws MinhaExcecao  {
        System.out.println("Ini do metodo2");
        
        //throw new ArithmeticException("Deu erro");
        throw new MinhaExcecao("deu errado qui");
        //ArithmeticException exception = new ArithmeticException("Deu errado");
        //throw exception; //jogar a exceptio na pilha,

        //System.out.println("Fim do metodo2");
    }
}

