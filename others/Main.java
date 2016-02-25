import com.*;

class Main{
    public static void main(String[] args) {
        com.Name jh = new com.Name("Johny","Edger");
        Person person1 = Person.createPersonWithName(jh);
        person1.print();

        com.Name jk = new com.Name("Jack","Marvel");
        Person person2 = Person.createPersonWithAge(jk,30);
        person2.print();

        // Calculator c = new Calculator();
        // c.add(2).add(3).multiply(10).subtract(5).divide(15);
        // System.out.println("Result : "+ c.getResult());
    }
}
