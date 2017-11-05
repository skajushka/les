package com.forest;

import com.forest.lifeform.LifeForm;

import java.util.List;

public class Forest {

    private List<LifeForm> biotope;

    public void setBiotope(List<LifeForm> biotope) {
        this.biotope = biotope;
    }

    public List<LifeForm> getBiotope() {
        return biotope;
    }

    public void addLifeform(LifeForm lifeForm) {
        biotope.add(lifeForm);
    }
}
