public class Duck {
    private Strategy strategy;

    public Duck(Strategy strategy) {
        this.strategy = strategy;
    }

     public int calc (int num1, int num2){
        return strategy.doOperation(num1,num2);
     }
}
