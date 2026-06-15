class Student {
    String name;
    int age;
}

public class main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Manju";
        s1.age = 21;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}