package herancaEx;

public class Funcionario extends Pessoa{
    int cnpj;
    String cargo;
    Double salario;
    public Funcionario(String nome, String email, int cpf, int idade, int cnpj, String cargo, Double salario) {
        super(nome, email, cpf, idade);
        this.cnpj = cnpj;
        this.cargo = cargo;
        this.salario =  salario;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
