public class Printer {
    public String name;
    public int copies;

    public Printer(String name, int copies) {
        this.name = name;
        this.copies = copies;

    }
   public void print(String name)
    {
        System.out.println("Printed doc: " + name);
    }
    public void print(String name, int pages)
    {
        System.out.println("Printed doc: " + name + " and specified pages: " + pages);
    }
    public void print(String name,int pages,  int count)
    {
        System.out.println("Printed doc: " + name + " and specified pages: " + pages + " count of copeis: " + count);
    }
}