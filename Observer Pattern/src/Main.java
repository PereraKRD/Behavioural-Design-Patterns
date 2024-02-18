// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new  BinaryObserver(subject);
        HexaObserver hexaObserver = new  HexaObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println();
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}