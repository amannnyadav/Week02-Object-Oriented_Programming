class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog("Happy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Piko", 1);

        Animal[] animals = {dog, cat, bird};
        for(int i=0;i<animals.length;i++){
            animals[i].makeSound();
        }
    }
}