import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;


public abstract class Sala {
    private int senha;

    private int dia,mes,ano;

    private int numero;
    private int numeroSala;

    public Sala(int senha, int numero,int dia,int mes,int ano) {
        this.senha = senha;
        this.numero = numero;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }


    public void reservar(int numeroSala){
        System.out.println("Sala do número: " + numeroSala +  " reservada para o dia:" +dia+ '/'+mes+'/'+ano);
    }
}