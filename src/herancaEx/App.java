package herancaEx;

public class App {
    public static void main(String[] args) {
        Motorista motorista = new Motorista("Matheus","matheus@email.com",00011133323,22,02,"programador",2000.00,32432423,"pla-4444");
        System.out.println(motorista.getNome());
        System.out.println(motorista.getCnh());
        System.out.println(motorista.getCnpj());
    }
}
