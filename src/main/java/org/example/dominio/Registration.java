package org.example.dominio;

public class Registration {

    protected String name;
    protected String id;

    public Registration(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
