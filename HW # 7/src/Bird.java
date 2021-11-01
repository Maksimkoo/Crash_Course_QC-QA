public abstract class Bird {
    private int feathers;
    private String layEggs;

    public Bird(int feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public abstract void output();

    public int getFeathers() {
        return feathers;
    }

    public void setFeathers(int feathers) {
        this.feathers = feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    public abstract void fly();
}
