public class Designer extends Funcionario{
    public Designer(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return 200;
    }

}
