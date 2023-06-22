package javapilha;

public class FluxoComTratamento {
  public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
           metodo1(); 
        } catch  (NullPointerException | ArithmeticException e) { //(Exception e)
            String msdErro = e.getMessage();
            System.out.println("exception " + msdErro);
            e.printStackTrace(); //pega o caminho percorrido pelo erro nas pilhas.
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        throw new ArithmeticException("Deu erro");
        //ArithmeticException exception = new ArithmeticException("Deu errado");
        //throw exception; //jogar a exceptio na pilha,

        //System.out.println("Fim do metodo2");
    }
}
