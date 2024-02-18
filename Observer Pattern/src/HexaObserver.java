public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
        this.subject = subject;
        subject.Add(this);
    }

    @Override
    public void Update(){
        System.out.println(Integer.toHexString(subject.getState()));
    }
}