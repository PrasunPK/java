package src.individual;

public class Characters extends WC implements Represent{
    public Characters(String data){
        super(data);
    }

    @Override
    public String toString(){
        return this.countCharacters()+"\t";
    }
}
