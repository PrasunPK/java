class Leopard extends Mammal implements Speedy{
    public Leopard(){
        super("Leopard",4);
    }

    @Override
    public void hasSpeed(){
        this.name = "leo";
        System.out.println(this.name + " has tremendous speed");
    }
}
