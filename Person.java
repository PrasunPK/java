class Person{
    private String name;

    private int age;

    private Person(Name personName, int age){
        this.name = personName.getFirstName() + " " + personName.getlastName();
        this.age = age;
    }

    private Person(Name personName){
        this.name = personName.getFirstName() + " " + personName.getlastName();
    }

    public static Person createPersonWithName(Name personName){
        return new Person(personName);
    }

    public static Person createPersonWithAge(Name personName, int age){
        return new Person(personName,age);
    }

    private void printPerson(){
        System.out.println(this.name + " with age "+ this.age);
    }

    public void print(){
        printPerson();
    }
}
