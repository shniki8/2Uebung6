package p3;

import java.sql.SQLOutput;

public class NumberContainer {
    private Number[] data;
    public NumberContainer(Number[] data){
        this.data = data;
    }
    public double sum(){
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
           sum += data[i].doubleValue();
        }
        return sum;
    }
    public void set(int index, Number value){
        if (index >= 0 && index < data.length){
            data[index] = value;
        }else {
            System.out.println("Index " + index + " out of range for array of length " + data.length); //Diesmal nützliche Meldung
        }
    }
}
