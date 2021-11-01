public class Swallow extends FlyingBird{
    public Swallow(int feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void output() {
        System.out.println("Swallow has feathers " + this.getFeathers() + " centimeters long.");
        System.out.println("Also this bird " + this.getLayEggs() + " lay eggs.");
    }
}
