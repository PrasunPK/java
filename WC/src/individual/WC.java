package individual;

public class WC {
    private String content;

    public WC(String data){
        this.content = data;
    }

    public int countCharacters(){
        return (int)this.content.length();
    }

    public int countWords(){
        return (this.content.split("\\ ").length) + this.countLines() - 1 ;
    }

    public int countLines(){
        return this.content.split("\n").length;
    }

    public int[] countAll(){
        int characters = this.countCharacters();
        int words = this.countWords();
        int lines = this.countLines();

        int []allCount = {lines, words, characters};
        return allCount;
    }
}
