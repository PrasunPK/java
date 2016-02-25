package src;

import src.individual.*;

public class Main{
    public static void main(String[] args) {
        String s = "This is a demo string.";
        Word w = new Word(s);
        String ws = w.toString();
        Characters c = new Characters(s);
        String cs = c.toString();
        Line l = new Line(s);
        String ls = l.toString();
        System.out.println(ls + ws + cs);
    }

}
