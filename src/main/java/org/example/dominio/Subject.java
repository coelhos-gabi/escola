package org.example.dominio;

import java.util.Objects;

public class Subject extends Registration{
    private String id;
    private final double media = 7.0;

    public Subject(String name, String id) {
        super(name, id);
    }

    public double getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return subject.getId().equals(this.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }
}
