package com.example.pkg;

public class BeanValidator {

    private String animal1;
    private String animal2;

    public String getAnimal1() {
        return animal1;
    }

    public void setAnimal1(String animal1) {
        this.animal1 = animal1;
    }

    public String getAnimal2() {
        return animal2;
    }

    public void setAnimal2(String animal2) {
        this.animal2 = animal2;
    }

    @Override
    public String toString(){
        return "Beans Validator" + animal1 + animal2;
    }
}
