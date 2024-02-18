
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck Cityduck = new Duck(new SimplyQuack(),new SimpleFly(), new SimpleDisplay());

        Cityduck.exMethods();

        Duck MountainDuck = new Duck(new SimplyQuack(),new NoFly(), new SimpleDisplay());

        MountainDuck.exMethods();

    }
}