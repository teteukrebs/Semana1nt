package polimorfismo;

public class UsuarioPremium implements Usuario{

    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 200){
            Double valorDesconto = valorProduto * 0.30;
            return valorDesconto;
        }else{
            return null;
        }
    }

    @Override
    public String getTipoUsuario() {
        return "Usuario Premium";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if(valorProduto > 100){

            return "O frete é gratis";
        }else {
            return "Não possuí desconto";
        }
    }
}
