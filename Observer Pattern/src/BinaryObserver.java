public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.Add(this);
    }
    @Override
    public void Update(){
        System.out.println(Integer.toBinaryString(subject.getState()));
    }
}