class hello{
    public static void main(String[] args) {
        Name jh = new Name("Johny","Edger");
        Person person1 = Person.createPersonWithName(jh);
        person1.print();

        Name jk = new Name("Jack","Marvel");
        Person person2 = Person.createPersonWithAge(jk,30);
        person2.print();
    }
}
