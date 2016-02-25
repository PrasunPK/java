package src.individual;

public class Word extends WC implements Represent{
    public Word(String data){
        super(data);
    }

    @Override
    public String toString(){
        return this.countWords()+"\t";
    }
}
