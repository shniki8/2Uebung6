package again.p5;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Otto Normalverbraucher", 69);
        animals[1] = new Lion("Lion", 30, 69);
        animals[2] = new Parrot("Captain", 20, "Arrrr!");

        for(Animal a : animals){
            a.makeSound();
        }
    }
}
