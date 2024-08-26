import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Define Player class
public class Player {
    private String name;
    private String username;
    private String userID;
    private int goldCoins;
    private int XP;

    public String setUser_ID(String username)
    {
        int len_name = username.length();
        int unique_sum=0;
        for(int x=0;x<len_name;x++)
        {
            unique_sum =+x;
        }
        String partname = Integer.toString(unique_sum);
        return (username+partname);
    }
    String homeGround;


    HashMap<String,Character> army1 = new HashMap<>();




    private static List<String> userProfiles = new ArrayList<>();


    // Constructor
    public Player(String name, String username, String playGround) {
        this.name = name;
        this.username = username;
        this.userID = setUser_ID(username);
        this.XP = 0;
        this.goldCoins = 500;
    }
    public Player(String name, String username,int XP, int goldCoins, String playGround) {
        this.name = name;
        this.username = username;
        this.userID =setUser_ID(username);
        this.XP = XP;
        this.goldCoins = goldCoins;

}



    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getUserID() {
        return userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoldCoins(int goldCoins) {
        this.goldCoins = goldCoins;
    }
    public int getGoldCoins() {
        return goldCoins;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }


    // Method to buy character
    public  void addCharacter(String characterType, Character character) {
            army1.put(characterType, character);
    }

    public void addEquipment(String characterType, String character, Equipment equipment) {
        for (Character c : army1.values()) {
            if (c.name == character) {
                c.price = (int) (c.price + (equipment.price * 0.2));
                c.attack = c.attack + equipment.attackBonus;
                c.defense = c.defense + equipment.defenseBonus;
                c.health = c.health + equipment.healthBonus;
                c.speed = c.speed + equipment.speedBonus;

            }
        }

    }
//    public  void inBattle

    public void showHeroes(){
        System.out.println("Archers : Shooter");
        System.out.println("Knights : Squire");
        if(army1.get("Mage").price==100){
            System.out.println("Mages : Warlock");
        }else {
            System.out.println("Mages : Illusionist");
        }
        System.out.println("Healers : Soother");
        System.out.println("Mythical Creatures : Dragon");
    }
    public void buyCharacter(Character character){
        // Check if the player has enough gold coins
        if (goldCoins >= character.price){
            goldCoins -= character.price;
            army1.put(character.name, character);
            System.out.println(character.name + " bought successfully ! ");
        } else {
            System.out.println("Not enough gold coins to buy " + character.name);
        }
    }
    public void sellCharacter(int Car){
        if(Car==3){
            if(army1.get("Mage").price==100){
                System.out.println("You can't sell this moment bcz of low of goldcoin");
            }else {
                army1.get("Mage").price=100;
                army1.get("Mage").attack=12;
                army1.get("Mage").defense=7;
                army1.get("Mage").health=10;
                army1.get("Mage").speed=12;
                setGoldCoins(8);
                System.out.println("You sell Illusionist and got Warlock");
                System.out.println("Now available goldcoin count: "+getGoldCoins());
            }
        }else{
            System.out.println("You can't sell this moment bcz of low of goldcoin ");
        }



//        if (goldCoins >= character.price){
//            goldCoins -= character.price;
//            army1.put(character.name, character);
//            System.out.println(character.name + " bought successfully ! ");
//        } else {
//            System.out.println("Not enough gold coins to buy " + character.name);
//        }
    }
    public void  buyEquipment(){
        System.out.println("You can't buy Equipment this moment bcz of low of goldcoin");
    }

}
