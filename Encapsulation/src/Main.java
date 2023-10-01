public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        //we can still access the fields without being in the class due to public call
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining Health = " + player.healthRemaining());

        //Enhanced code using encapsulation
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.healthRemaining());



    }
}
