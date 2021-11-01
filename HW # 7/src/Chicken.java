public class Chicken extends NonFlyingBird
{
    public Chicken(int feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void output() {
        System.out.println("Chicken has feathers " + this.getFeathers() + " centimeters long.");
        System.out.println("Also this bird " + this.getLayEggs() + " lay eggs.");
    }
}