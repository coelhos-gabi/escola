package org.example.dominio;

public class Responsaveis {
    private String name;
    private String telefone;
    private String email;

    public Responsaveis(String name, String telefone, String email) {
        this.name = name;
        this.telefone = telefone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}
