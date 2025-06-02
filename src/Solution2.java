class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Greet method
    public void greet() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Solution2 {
    public static void main(String[] args) {
        Person p = new Person("Bold", 25);
        p.greet();
    }
}
