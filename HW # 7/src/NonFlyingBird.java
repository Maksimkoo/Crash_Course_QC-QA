public abstract class NonFlyingBird extends Bird {

    public NonFlyingBird(int feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Take a walk!");
        System.out.println();;
    }
}