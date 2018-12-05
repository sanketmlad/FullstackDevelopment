package com.example.pkg;

public class Calculator {
    int n1;
    int n2;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    private Calculator(int n1, int n2){
            this.n1 = n1;
            this.n2 = n2;
        }
    public double divide(){
        return (double)n1/(double)n2;
    }

    public int multiply(){
        return n1*n2;
    }

    public int add(){
        return n1+n2;
    }
    public int substract(){
        return n1-n2;
    }
}
