public class Calculator{
    private int result;

    public Calculator(){
        result = 0;
    }

    public Calculator add(int number){
        result = result + number;
        return this;
    }

    public Calculator subtract(int number){
        result = result - number;
        return this;
    }

    public Calculator multiply(int number){
        result = result * number;
        return this;
    }

    public Calculator divide(int number){
        result = result / number;
        return this;
    }

    public int getResult(){
        return result;
    }
}
