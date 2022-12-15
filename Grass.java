public class Grass {
   private int amount = 200;
   public boolean noGrass(){
       return amount <= 0;
   }
   public void eat() {
       this.amount -= 35;
   }
   public void isLight() {
       this.amount += 1;
   }
}
