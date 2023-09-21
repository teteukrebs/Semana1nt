package polimorfismoEx;

public interface Usuario {
    Double getValorDesconto(double valorProduto);

    String getTipoUsuario();

    String getValorFreteDesconto(double valorFrete, double valorProduto);

}
