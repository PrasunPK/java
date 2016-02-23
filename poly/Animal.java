class Animal {
    protected String name;
    protected int legs;
    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }

    public void talk(){
        System.out.println(this.name + " : I can talk .");
    }
}
