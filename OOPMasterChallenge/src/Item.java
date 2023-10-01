public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";
    private String ice;


    public Item(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public double getBasePrice() {
        return this.price;
    }

    public String getName() {
        if(type.equals("SIDE")|| type.equals("side") || type.equals("drink") || type.equals("DRINK")){
            return size + " " + name;
        }
        return name;
    }

    public double getAdjustedPrice() {
        return switch(size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default ->  getBasePrice();
        };
    }

    public double withIce(){
        return switch(ice){
            case "ICE" -> getAdjustedPrice() + 2;
            case "ice" -> getAdjustedPrice() + 2;
            default -> getAdjustedPrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setIce(String ice){
        this.ice = ice;
    }

    public static void printItem(String type , double price) {
        System.out.printf("%20s:%6.2f%n", type, price);
    }

    public void printItem() {
        printItem(getName(),getAdjustedPrice());
    }
}
