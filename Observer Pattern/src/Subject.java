import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return state;
    }

    public void Add(Observer obs){
        this.observers.add(obs);
    }

    public void setState(int state){
        this.state = state;
        NotifyAll();
    }

    public void NotifyAll(){
        for (Observer obs: observers) {
            obs.Update();
        }
    }
}