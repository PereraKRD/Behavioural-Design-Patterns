
public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck(new Substract());
        System.out.println(duck.calc(10,12));
    }
}