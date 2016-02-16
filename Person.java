class Person{
    private String name;

    private int id;

    public Person(Name personName, int id){
        this.name = personName.getFirstName() + " " + personName.getlastName();
        this.id = id;
    }

    public Person(Name personName){
        this.name = personName.getFirstName() + " " + personName.getlastName();
    }

    private void printPerson(){
        System.out.println(this.name + " has the ID "+ this.id);
    }

    public void print(){
        printPerson();
    }
}
