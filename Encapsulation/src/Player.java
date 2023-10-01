//Improper way of using encapsulation

public class Player {

    public String name;
    public int health;
    public String weapon;

    //lose Health method
    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of the game");
        }
    }

    //getter method
    public int healthRemaining() {
        return health;
    }

    //restore health method
    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;
        if(health > 100) {
            System.out.println("Player health restored to 100%");
            health = 100;
        }
    }
}
