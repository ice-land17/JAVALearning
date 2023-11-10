public class ThisClassroomExercise {
    public static void main(String[] args) {
        Person p1 = new Person("mary",23);
        Person p2 = new Person("mary",23);
        System.out.println(p1.compareTo(p2));
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person p) {
        return this.name.equals(p.name) && this.age == p.age;
    }
}