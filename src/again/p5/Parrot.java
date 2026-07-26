package again.p5;

public class Parrot extends Animal {
    private String word;
    public Parrot(String name, int energy, String word){
        super(name, energy);
        this.word = word;
    }

    @Override
    public void makeSound() {
        System.out.println(word);
    }
}
