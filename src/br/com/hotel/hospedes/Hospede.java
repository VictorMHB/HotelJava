package br.com.hotel.hospedes;

public class Hospede {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public Hospede(String nome, String cpf, String email, String telefone) {
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || !cpf.matches("[0-9]+")){
            throw new IllegalArgumentException("O CPF deve conter apenas números");
        }
            this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()){
            throw new IllegalArgumentException("O e-mail não pode estar vazio");
        }
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || !telefone.matches("[0-9]+")){
            throw new IllegalArgumentException("O número de telefone deve conter apenas números");
        }
        this.telefone = telefone;
    }
}


