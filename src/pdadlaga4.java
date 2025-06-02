class Person {
    String name;
    int age;
    private String email;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hi, my name is " + name + ", I am " + age + " years old and my email is " + email + ".");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Bold", 25);
        p.setEmail("bold@gmail.com");  
        p.greet();

        Person p2 = new Person("Tuya", 30);
        p2.setEmail("tuyagmail.com"); 
        p2.greet();
    }
}

