public class Duck {
    private IQuackBehaviour Qb;
    private IFlyBehaviour Fb;
    private IDisplayBehaviour Db;

    public Duck(IQuackBehaviour qb, IFlyBehaviour fb, IDisplayBehaviour db) {
        this.Qb = qb;
        this.Fb = fb;
        this.Db = db;
    }

    public void exMethods(){
        this.Qb.Quack();
        this.Fb.Fly();
        this.Db.Display();
    }


}
