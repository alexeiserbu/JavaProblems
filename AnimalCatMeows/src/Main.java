class PolymorphismExample {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        animal = new cat();
        animal.makeSound();
    }
}