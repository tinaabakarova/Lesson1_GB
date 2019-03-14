package classes;

import enums.*;

public class Barrier {
    private String name;
    private Hardness hardness;

    public Barrier(String name, Hardness hardness) {
        this.name = name;
        this.hardness = hardness;
    }

    public Hardness getHardness() {
        return hardness;
    }
}
