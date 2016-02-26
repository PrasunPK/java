package com;

public class Word extends WC implements Represent{
    public Word(String data){
        super(data);
    }

    @Override
    public String represent(){
        return this.countWords()+"\t";
    }
}
