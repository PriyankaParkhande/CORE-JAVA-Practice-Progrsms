
abstract class animal {
    abstract void makeSound();
}

class Dog extends animal {
    void makeSound() {
        System.out.println("sound of dog is: bho bho or bark");
    }
}

class cat extends animal {
    void makeSound() {
        System.out.println("sound of cat is: mav mav");
    }
}

public class animalApp1 {
    public static void main(String x[]) {
        Dog d = new Dog();
        d.makeSound();
        cat c = new cat();
        c.makeSound();
    }

}
