import java.util.List;

public class Atendente extends Funcionario{

    private List<String> sintoma;
    public Atendente(String nome, String cpf, String dataNacimento, List<String> sintomas) {
        super(nome, cpf, dataNacimento);

        this.sintoma = sintomas;
    }



    public List<String> sintoma() {
        return sintoma;
    }

    public String inicarAtendimento(int senha, String nome){
        return "Passando para o Clinico Geral o paciente: "+ nome;
    }
}
