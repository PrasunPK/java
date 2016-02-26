package com;

public class Characters extends WC implements Represent{
    public Characters(String data){
        super(data);
    }

    @Override
    public String represent(){
        return this.countCharacters()+"\t";
    }
}
