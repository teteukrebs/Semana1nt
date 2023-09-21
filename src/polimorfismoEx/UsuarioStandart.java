package polimorfismoEx;

public class UsuarioStandart implements Usuario{
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 200){
            Double valorDesconto = valorProduto * 0.15;
            return valorDesconto;
        }else{
            return null;
        }
    }

    @Override
    public String getTipoUsuario() {
        return "Usuario Standart";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if(valorProduto > 200){
            Double valorFreteDesconto = valorFrete * 0.10;
            return "O desconto do frete é" + valorFreteDesconto;
        }else {
            return "Não possuí desconto";
        }
    }
}
