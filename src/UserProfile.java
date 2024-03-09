//import java.util.Scanner;
//
//public class UserProfile extends  Player{
//    String name;
//    String username;
//    int userID;
//    int XP;
//    int goldCoins;
//    public UserProfile(){
//
//    }
//    public UserProfile(String Name,String UserName){
//        this.name=Name;
//        this.username=UserName;
//        this.XP=0;
//        this.goldCoins=500;
//        this.userID=1;
//
//    }
//    public void startPlay(){
//        Player player1=new Player();
//        createNewPlayerArmy(player1,this.goldCoins);
//    }
//    public void previousPlay(String archer,String armour1,String artefact1,String knight,String armour2,String artefact2,String mage,String armour3,String artefact3,String healer,String armour4,String artefact4,String mythicalCreature,String armour5,String artefact5){
//        Player player2=new Player();
//        defaultArmy(player2,archer,armour1,artefact1,knight,armour2,artefact2,mage,armour3,artefact3,healer,armour4,artefact4,mythicalCreature,armour5,artefact5);
//    }
//
//}

class UserProfile {
    private static int userIDCounter = 1;

    private String name;
    private String username;
    private int userID;
    int XP;
    int goldCoins;
    // Constructor
    public UserProfile(String name, String username) {
        this.name = name;
        this.username = username;
        this.userID = userIDCounter++;
        this.XP=0;
        this.goldCoins=500;
        this.userID=1;

    }
    public void startPlay(){

       Player player1=new Player();
       Player.createNewPlayerArmy(player1);
    }
    // Getters
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }
}