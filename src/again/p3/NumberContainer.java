package again.p3;

public class NumberContainer {
    Number[] data;
    public NumberContainer(Number[] data){
        this.data = data;
    }
    public double sum(){
        double sum = 0;
        for (Number n : data){
            sum+= n.doubleValue();
        }
        return sum;
    }
    public void set(int index, Number value){
        try {
            data[index] = value;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
