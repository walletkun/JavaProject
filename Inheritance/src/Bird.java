public class Bird extends Animal{

    private String color;
    private String beak;

    public Bird(){
        super("Robin" , "Small" , 10);
    }

    public Bird(String type, double weight){
        this(type, weight, "blue" , "cone");
    }
    public Bird(String type,double weight,String color, String beak){
       super(type, weight <= 10 ? "small" : (weight <= 20 ? "medium" : "large") , weight);
       this.color = color;
       this.beak = beak;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                ", beak='" + beak + '\'' +
                "} " + super.toString();
    }
}
