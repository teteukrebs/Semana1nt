package polimorfismo;

public class UsuarioBase implements Usuario{
    @Override
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 300){
            Double valorDesconto = valorProduto * 0.05;
            return valorDesconto;
        }else{
            return null;
        }
    }

    @Override
    public String getTipoUsuario() {
        return "Usuario Base";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if(valorProduto > 300){
            Double valorFreteDesconto = valorFrete * 0.05;
            return "O desconto do frete é" + valorFreteDesconto;
        }else {
            return "Não possuí desconto";
        }
    }
}
