
import java.util.*;
class Main {
    private static List<UserProfile> userProfiles = new ArrayList<>();

    // Method to create a new user profile
    public static void createUserProfile(String name, String username) {
        // Check if username is already taken
        for (UserProfile profile : userProfiles) {
            if (profile.getUsername().equals(username)) {
                System.out.println("Username '" + username + "' is already taken. Please choose a different username.");
                return;
            }
        }

        // Create new user profile
        UserProfile newUser = new UserProfile(name, username);
        System.out.println("User profile created successfully!");
        System.out.println("Name: " + newUser.getName());
        System.out.println("Username: " + newUser.getUsername());
        System.out.println("UserID: " + newUser.getUserID());
        newUser.startPlay();
    }

    public static void main(String[] args) {
        // Player 1 profile
        //createUserProfile("GeraltofRivia", "whitewolf");

        //Create a player profile of your own
        System.out.println("Give me a Name: ");
        Scanner input1=new Scanner(System.in);
        String playerName=input1.nextLine();
        System.out.println("Give me a Username:");
        String playerUserName=input1.nextLine();
        createUserProfile(playerName, playerUserName);

    }
}


//import java.util.Scanner;
//
//public class Main extends UserProfile{
//    public static void main(String[] args) {
//
//        UserProfile user1=new UserProfile();
//        user1.name="GeraltofRivia";
//        user1.username = "whitewolf";
//        user1.XP=32;
//        user1.goldCoins=215;
//        user1.playGround="Marshland";
//
//        user1.previousPlay("Ranger","Chainmail",null,"Squire",null,null,"Warlock",null,null,"Medic","Amulet",null,"Dragon",null,null);
//
//
//        System.out.println("Give me a Name: ");
//        Scanner input1=new Scanner(System.in);
//        String playerName=input1.nextLine();
//        System.out.println("Give me a Username:");
//        //Scanner input2=new Scanner(System.in);
//        String playerUserName=input1.nextLine();
//
//        UserProfile user2=new UserProfile(playerName,playerUserName);
//        user2.startPlay();
//    }
//}
