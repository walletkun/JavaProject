public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, (weight <= 4) ? "small" : (weight > 7 && weight < 10) ? "medium" : "large", weight);
        this.gills = gills;
        this.fins = fins;
    }

    public void moveMuscle() {
        System.out.println("muscles moving ");
    }

    private void moveBackFins() {
        System.out.println("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscle();
        if(speed == "fast")
            moveBackFins();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }

}
