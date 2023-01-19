
import java.util.Arrays;

    public class Main {
        public static void main(String[] args) {

            Paciente Helena = new Paciente("77777","Helena Issamoto","21/07/22",9, Arrays.asList("Resfriada") );
            ClinicoGeral medico = new ClinicoGeral("4231","Marcelo","25/09/23","abcde");

            System.out.println(medico.realizarDiagnostico(Helena.sintoma()));

            Cirurgia salaDeCirurgia = new Cirurgia(25,3);
            salaDeCirurgia.reservar(05 );
            Cirurgiao cirurgiao = new Cirurgiao("0000000","Joyce","21/12/95","Cirurgião Junior",salaDeCirurgia);

        }
    }

