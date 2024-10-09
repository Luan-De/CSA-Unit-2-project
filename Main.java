//Name: Eclipse Vanson and Luan Dematos
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //String Inputs
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

        //Random Number generator
        int num = (int)(Math.random() * ((familyRelative1.length() - 1) - 1)) + 1;
        int num2 = (int)(Math.random() * ((familyRelative2.length() - 1) - 1)) + 1;


        //Sci Fi varibles 
        String sciFiFirstname = firstName.substring(0, 3) + lastName.substring(0, 2).toLowerCase();
        String sciFiLastname = city.substring(0,2) + grammerSchool.substring(-3).toLowerCase();
        String placeOfOri = familyRelative1.substring(num) + familyRelative2.substring(num2);

        //Welcome message
        System.out.println("Welcome " + sciFiFirstname + " " + sciFiLastname + " " + placeOfOri + "!");
        
    }
}
