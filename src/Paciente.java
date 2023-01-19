import java.util.List;

public class Paciente extends Pessoa {
    private int senhaAtendimento;
    private List<String> sintoma;

    public Paciente(String cpf, String nome, String dataNascimento, int senhaAtendimento, List<String> sintomas) {
        super(cpf, nome, dataNascimento);
        this.senhaAtendimento = senhaAtendimento;
        this.sintoma = sintomas;
    }

    public int getSenhaAtendimento() {
        return senhaAtendimento;
    }

    public void setSenhaAtendimento(int senhaAtendimento) {
        this.senhaAtendimento = senhaAtendimento;
    }

    public List<String> sintoma() {
        return sintoma;
    }
}
