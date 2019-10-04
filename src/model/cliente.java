package model;


public class cliente {

        public cliente(String nome, String cpf, String email, String telefone, String rua, String cidade, String bairro, int numero, int cep)
    {
        Nome = nome;
        Cpf = cpf;
        Email = email;
        Telefone = telefone;
        Rua = rua;
        Cidade = cidade;
        Bairro = bairro;
        Numero = numero;
        Cep = cep;
        
    }
    
    
    
    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getCep() {
        return Cep;
    }

    public void setCep(int Cep) {
        this.Cep =  Cep;
    }


    
    private String Nome;
    private String Cpf;
    private String Email;
    private String Telefone;
    private String Rua;
    private String Cidade;
    private String Bairro;
    private int Numero;
    private int Cep;
    

}
