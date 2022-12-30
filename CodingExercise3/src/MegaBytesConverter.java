public class MegaBytesConverter {
    public static void main(String[] args) {
        rintMegaBytesAndKiloBytes(2500);
    }
    public static void rintMegaBytesAndKiloBytes(int kiloBytes){
            if(kiloBytes < 0){
                System.out.println("Invalid Value");
            }
            else if (kiloBytes >= 0) {
                System.out.println(kiloBytes +" KB = " +kiloBytes/1024 + " MB and " +kiloBytes % 1024+ " KB");
            }
        {

            }
    }
}
