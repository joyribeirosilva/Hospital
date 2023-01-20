import java.util.List;

public class Paciente extends Pessoa {

    private int senhaAtendimento;
    public Paciente( String cpf,String nome, String dataNascimento,int senhaAtendimento) {
        super(cpf, nome, dataNascimento);
        this.senhaAtendimento = senhaAtendimento;

    }
    public int getSenhaAtendimento() {
        return senhaAtendimento;
    }

    public void setSenhaAtendimento(int senhaAtendimento) {
        this.senhaAtendimento = senhaAtendimento;
    }

}