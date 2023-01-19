public class Cirurgiao extends Medico{

    private Cirurgia salaDeCirurgia;

    public Cirurgiao(String cpf, String nome, String dataNascimento, String certificado, Cirurgia salaDeCirurgia) {
        super(cpf, nome,dataNascimento, certificado);
        this.salaDeCirurgia = salaDeCirurgia;
    }
}