package com.company;

public class Teherauto extends Auto {
    private int maxSzallithatoTeher;

    public Teherauto(String rendszam, int teljesitmeny, int maxSzallithatoTeher) {
        super(rendszam, teljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return "A teherautó max szállítható terhe: " + this.maxSzallithatoTeher;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != getClass()) return false;
        Teherauto teherauto = (Teherauto) obj;
        return this.maxSzallithatoTeher == teherauto.maxSzallithatoTeher;
    }
}
