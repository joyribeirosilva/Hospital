
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Paciente Helena = new Paciente("52152","Helena Issamoto","21/07/22",9 );

        ClinicoGeral medico = new ClinicoGeral("231231","Junior","25/09/95","medicoEspecialista");
        Atendente atendente = new Atendente(Helena.nome,Helena.cpf,Helena.dataNascimento, Arrays.asList("Resfriado","Resfriado","Resfriado","Resfriado"));

        System.out.println(atendente.inicarAtendimento(Helena.getSenhaAtendimento(),Helena.cpf));
        System.out.println(medico.realizarDiagnostico(atendente.sintoma()));


        Cirurgia salaDeCirurgia = new Cirurgia(25,3,06,12,2023);
        salaDeCirurgia.reservar(Helena.getSenhaAtendimento() );
        Cirurgiao cirurgiao = new Cirurgiao("0000000","Joyce","21/12/95","Cirurgião Junior",salaDeCirurgia);

    }
}