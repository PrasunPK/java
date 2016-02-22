public class WC {
    private String content;

    public WC(String data){
        this.content = data;
    }

    public int countCharacters(){
        return (int)this.content.length();
    }

    public int countWords(){
        return this.content.split("\\ ").length;
    }

    public int countLines(){
        return this.content.split("\n").length;
    }
}
