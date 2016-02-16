class Person{
    private String name;

    private int id;

    public Person(String personName, int id){
        this.name = personName;
        this.id = id;
    }

    public Person(String personName){
        this.name = personName;
    }

    private void printPerson(){
        System.out.println(this.name + " has the ID "+ this.id);
    }

    public void print(){
        printPerson();
    }
}
