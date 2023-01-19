import java.util.List;

public class Medico extends Funcionario{
    private Paciente paciente;

    private String formacao;


    public Medico(String cpf, String nome, String dataNascimento, String formacao) {
        super(cpf, nome,dataNascimento );
        this.formacao = formacao;
    }

    public final void receberPaciente(Paciente pac){
        this.paciente = pac;
    }

    public final void dispensarPaciente(){
        this.paciente = null;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String realizarDiagnostico(List<String> sintomas){
        if(sintomas.size() == 0){
            return "Melhorou";
        } else  {
            return "Piorou";
        }
    }
}
