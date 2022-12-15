import static java.lang.Thread.sleep;

public class Simulation {

    public static void main(String[] args) throws InterruptedException {
        Frog frog = new Frog();

        int day = 1;

        System.out.println();
        System.out.println("Day " + day + "!");
        System.out.println();

        int hour = 0;

        while(!frog.isDeath()){
            if(hour == 24){
                hour = 0;
                day++;
                System.out.println();
                System.out.println("Day " + day + "!");
                System.out.println();
            }
            if(hour > 9){
                System.out.println(0 + hour + ":00");
            }else
                System.out.println(hour + ":00");
            frog.eat(hour);
            frog.isSleeping(hour);
            frog.isWalking(hour);
            hour++;
            sleep(400);
        }
        System.out.println("But it isn't enough for that reason, He felt nervous and left the other world: ");
    }
}