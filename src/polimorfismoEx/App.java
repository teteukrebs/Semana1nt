package polimorfismoEx;

public class App {
    public static void main(String[] args) {
        UsuarioBase usuarioBase = new UsuarioBase();
        UsuarioStandart usuarioStandard = new UsuarioStandart();
        UsuarioPremium usuarioPremium = new UsuarioPremium();
        double valorProduto = 400;
        double valorFrete = 50;
        System.out.println("Tipo de Usuário: " + usuarioBase.getTipoUsuario());
        System.out.println("Desconto no produto: " + usuarioStandard.getValorDesconto(valorProduto));
        System.out.println("Desconto no frete: " + usuarioPremium.getValorFreteDesconto(valorFrete, valorProduto));
    }
}
