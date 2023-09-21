package herancaEx;

public class Motorista extends Funcionario{

    int cnh;
    String placa;

    public Motorista(String nome, String email, int cpf, int idade, int cnpj, String cargo, Double salario, int cnh, String placa) {
        super(nome, email, cpf, idade, cnpj, cargo, salario);
        this.cnh = cnh;
        this.placa = placa;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
