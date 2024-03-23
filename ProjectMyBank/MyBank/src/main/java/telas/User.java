
package telas;


public class User {
    private int conta;
    private String nome;
    private String cpf;
    private String cep;
    private String email;
    private String telefone;
    private String nascimento;
    private String Nacionalidade;
    private String senha;
    private double saldo;
    private double limite;
    private double fatura;
    private double investido;
    private int codConta;

    public User(int conta, String nome, String cpf, String cep, String email, String telefone, String nascimeto, String Nacionalidade, String senha, double saldo, double limite, double fatura, double investido) {
        this.conta = conta;
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimeto;
        this.Nacionalidade = Nacionalidade;
        this.senha = senha;
        this.saldo = saldo;
        this.limite = limite;
        this.fatura = fatura;
        this.investido = investido;
    }

    public User(String nome, String cpf, String cep, String email, String telefone, String nascimeto, String Nacionalidade, String senha,int cod) {
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimeto;
        this.Nacionalidade = Nacionalidade;
        this.senha = senha;
        this.codConta = cod;
    }

    public User(String nome, String cpf, String cep, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
    }

    public User(int codConta, String senha) {
        this.codConta = codConta;
        this.senha = senha;
    }

    public User() {
    }

    User(String nome, String cpf, String cep, String email, String telefone, String nascimento, String nacionalidade, String senha, int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodConta() {
        return codConta;
    }

    public void setCodConta(int CodConta) {
        this.codConta = CodConta;
    }
    
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimeto) {
        this.nascimento = nascimeto;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getFatura() {
        return fatura;
    }

    public void setFatura(double fatura) {
        this.fatura = fatura;
    }

    public double getInvestido() {
        return investido;
    }

    public void setInvestido(double investido) {
        this.investido = investido;
    }
    
    
}
