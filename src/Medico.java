import java.util.List;

public class Medico extends Funcionario{
    private Paciente paciente;

    private String formacao;


    public Medico(String cpf, String nome, String dataNascimento, String formacao) {
        super(cpf, nome,dataNascimento );
        this.formacao = formacao;
    }


    public final void encerrarComPaciente(){
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
            return "Recebeu alta";
        } else  {if (sintomas.size() <= 3){
            return "Caso moderado";
        }
        else {
            return "Caso grave, cirurgia";
        }
        }
    }
}