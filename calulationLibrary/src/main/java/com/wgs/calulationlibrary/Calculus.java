package com.wgs.calulationlibrary;

public class Calculus {
    private int a;
    private int b;

    public Calculus(int a ,int b){
        this.a=a;
        this.b=b;
    }
    public int getMultiplyData(){
        return a*b;
    }
    public int getSubstractData(){
        return a-b;
    }
    public int getAdditionData(){
        return a+b;
    }

}
