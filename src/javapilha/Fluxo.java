package javapilha;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
           metodo1(); 
        } catch  (NullPointerException | ArithmeticException e) { //(Exception e)
            String msgErro = e.getMessage();
            System.out.println(msgErro);
            e.getStackTrace(); //pega o caminho percorrido pelo erro nas pilhas.
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
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = 1 / 0;
        }
        System.out.println("Fim do metodo2");
    }
}