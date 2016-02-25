package src.individual;

public class Line extends WC implements Represent{
    public Line(String data){
        super(data);
    }

    @Override
    public String toString(){
        return this.countLines()+"\t";
    }
}
