public abstract class FlyingBird extends Bird{

    public FlyingBird(int feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Take a flight!");
        System.out.println();
    }
}