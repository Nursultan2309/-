package com.company;

public class Rescure {
    private String name;
    private String uniform;
    private String instrument;

  //  public Rescure() {}


    public Rescure(String name, String uniform) {
        this.name = name;
        this.uniform = uniform;
    }

    public Rescure(String name, String uniform, String instrument) {
        this.name = name;
        this.uniform = uniform;
        this.instrument = instrument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Rescure{" +
                "name='" + name + '\'' +
                ", uniform='" + uniform + '\'' +
                ", instrument='" + instrument + '\'' +
                '}';
    }
}
