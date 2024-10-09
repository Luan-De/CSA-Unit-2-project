import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("If you provide me some information I will provide a Science Fiction name for you");
        System.out.println("Please have all responses be at least three characters longs.");
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        String SciFiFirstname = firstname.substring(0, 3) + lastName.substring(0, 2).toLowerCase();
    }
}
