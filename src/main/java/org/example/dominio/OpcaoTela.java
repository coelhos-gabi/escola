package org.example.dominio;

public enum OpcaoTela {
    CADASTRAR (1, "Cadastrar aluno"),
    ACESSAR (2,"Acessar notas"),
    REGISTRAR (3,"Registrar notas no sistema"),
    SAIR (0,"Sair");

    private int code;
    private String label;

    OpcaoTela(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }
}
