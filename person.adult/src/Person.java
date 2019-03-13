public class Person {
    public String firstName;
    public int age;
    public int weight;

    public Person(String firstName, int age, int weight) {
        this.firstName = firstName;
        this.age = age;
        this.weight=weight;
    }
    void display()
    {

        System.out.println(firstName + age + weight);
    }
}