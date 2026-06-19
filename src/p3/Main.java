package p3;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {10, 20, 30};
        NumberContainer nc = new NumberContainer(ints);
        System.out.println(nc.sum());
        // ^ korrekt, da Integer Subklasse von Number ist und deshalb auch als Eingabe funktioniert. Ausgabe: 10+20+30=60, was dachtest du...
        //nc.set(0, 3.14); //kompiliert
        // ^ data enthält zur Laufzeit ein Int-Array, also ist eine Zuweisung dieses double boese!
        printAll(ints);
        // ^ funktioniert natuerlich
    }
    public static void printAll(Number[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
