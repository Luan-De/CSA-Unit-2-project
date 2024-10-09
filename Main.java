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
        System.out.println("Enter the city where you or one of your parents were born: ");
        String city = input.nextLine();
        System.out.println("Enter the name of your grammer school: ");
        String grammerSchool = input.nextLine();
        System.out.println("Enter the first name of a sibling or relative: ");
        String familyRelative1 = input.nextLine();
        System.out.println("Enter the first name of a second sibling or relative: ");
        String familyRelative2 = input.nextLine();



        
        String SciFiFirstname = firstName.substring(0, 3) + lastName.substring(0, 2).toLowerCase();
    }
}
