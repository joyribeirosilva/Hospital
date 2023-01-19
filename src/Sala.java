import java.time.LocalDate;


public abstract class Sala {
    private int senha;

    private int numero;
    private int numeroSala;

    public Sala(int senha, int numero) {
        this.senha = senha;
        this.numero = numero;

    }

    public void reservar(int numeroSala){
        System.out.println("Sala do número " + numeroSala +  "reservada");
    }
}
