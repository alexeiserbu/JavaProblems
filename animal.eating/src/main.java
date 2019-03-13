
class Animal {
    public void eat() {
        System.out.println("Om-nom-nom");
    }
    protected void run () {
        System.out.println("Runing");
    }
}


class Elephant extends Animal {
    @Override
    public void eat() {
        System.out.println("Om-nom-nom");
    }
}
class Fish extends Animal {
    @Override
    public void run() {
        System.out.println("Runing");
    }
}


class Main {
    public static void main(String args[])
    {
        Animal elephant = new Animal();
        elephant.eat();

        Animal elephant1 = new Elephant();
        elephant1.eat();

        Animal fish = new Fish();
        fish.run();
    }
}