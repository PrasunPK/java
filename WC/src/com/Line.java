package com;

public class Line extends WC implements Represent{
    public Line(String data){
        super(data);
    }

    @Override
    public String represent(){
        return this.countLines()+"\t";
    }
}
