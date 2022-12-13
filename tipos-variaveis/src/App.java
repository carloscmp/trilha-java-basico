public class App {
    public static void main(String[] args) {

        int a = 5, b = 6;
        String resultado;
        /*String resultado = a == b ? "vdd" : "fake";
        System.out.println(resultado);*/
        boolean simNão = a == b;
        resultado = simNão == false ? "não é igual b" : "é igual b";
        
        System.out.println("a " +resultado);
    }

}
