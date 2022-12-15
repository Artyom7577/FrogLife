public class Frog {
    Grass grass = new Grass();
    Tree tree = new Tree();
    public void eat(int time){
        if(time >= 14 && time <= 16){
            System.out.println("Frog is eating!");
            grass.eat();
            tree.isBreathing();
            tree.isLight();
            grass.isLight();
        }
    }
    public void isWalking(int time){
        if(time != 14 && time != 16 && time != 15 && time <= 19 && time >= 13){
            System.out.println("Frog is happy and walking!");
            grass.isLight();
            tree.isLight();
        }else if (time <= 13 && time >= 6) {
            System.out.println("Frog is hungry and walking sad!");
            grass.isLight();
            tree.isLight();
        }
    }
    public void isSleeping(int time){
        if(time >= 20 || time < 6){
            System.out.println("Frog is sleeping!");
        }
    }
    public boolean isDeath(){
        return tree.noAir() || grass.noGrass();
    }
}
