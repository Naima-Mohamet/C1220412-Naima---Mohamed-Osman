import java.util.*;
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // All characters
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%&*";

        String allCharacters = upper + lower + digits + special;

        System.out.print("Please enter the long password you want: ");
        int length = input.nextInt();

        String password = "";

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(allCharacters.length());
            password += allCharacters.charAt(index);
        }
        System.out.println("Your password is: " + password);
    }
}
