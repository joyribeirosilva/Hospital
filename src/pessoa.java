public abstract class  pessoa {
    public String nome;
    public String cpf;
    public String dataNascimento;

    public pessoa (String nome, String cpf, String dataNacimento){
        this.nome = nome;
        this.cpf= cpf;
        this.dataNascimento = dataNacimento;
    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome= nome;
    }
    public String getCpf() {
        return cpf;

    }

    public void setCpf(String nome) {
        this.cpf=cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;

    }

    public void setDataNascimento(String dataNascimento) {

        this.cpf= dataNascimento;
    }
}
