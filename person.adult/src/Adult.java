public class Adult extends Person {
    private String pasport;
    public Adult(String firstName, int age, int weight, String pasport) {
        super(firstName,age, weight);
        this.pasport = pasport;
    }
    public void setAge ( int age)
    {
        this.age=age;
    }
    public void setPasport( String pasport)
    {
        this.pasport= pasport;
    }
}