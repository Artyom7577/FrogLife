public class Tree {
    private int air = 100;
    public boolean noAir(){
        return air <= 0;
    }
    public void isLight(){
        this.air += 4;
    }
    public void isBreathing(){
        this.air -= 7;
    }
}
