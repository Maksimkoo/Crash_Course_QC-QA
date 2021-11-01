public class Penguin extends NonFlyingBird
{
    public Penguin(int feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void output() {
        System.out.println("Penguin has feathers " + this.getFeathers() + " centimeters long.");
        System.out.println("Also this bird " + this.getLayEggs() + " lay eggs.");

    }
}