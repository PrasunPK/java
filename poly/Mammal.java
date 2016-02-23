class Mammal extends Animal implements Jumpable{
    public Mammal(String name, int legs){
        super(name, legs);
    }

    public void hasIntelligence(){
        System.out.println("Maybe "+this.name+" has intelligence");
    }

    public void shout(){
        System.out.println( this.name + " can shout !!");
    }

    @Override
    public void jump(){
        System.out.println(this.name + " can jump");
    }
}
