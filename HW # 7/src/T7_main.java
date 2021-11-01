public class T7_main {
    public static void main(String[] args) {
        Swallow sw = new Swallow(20, "can");
        Eagle ea = new Eagle(35, "can");
        Chicken ch = new Chicken(10, "can");
        Penguin pe = new Penguin(5, "can");

        Bird[] birds = new Bird[]{sw, ea, ch, pe};

        for (Bird bird : birds) {
            bird.output();
            bird.fly();

        }
    }
}