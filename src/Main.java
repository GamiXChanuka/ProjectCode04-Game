import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Main class
public class Main {
    private  static List<String> userProfiles = new ArrayList<>();
    public static boolean createUserProfile(Player player,String name, String username) {
        // Check if username is already taken
        boolean usernameOK=true;
        for (String profile : userProfiles) {
            if (player.getUsername().equals(username)) {
                //System.out.println("Username '" + username + "' is already taken. Please choose a different username.");
                usernameOK=false;
            }
        }
        return usernameOK;
    }


    public static void main(String[] args) {
        // Create player profiles

        Player player1= new Player("GeraltofRivia", "whitewolf", 32,215,"MarshLand");
        userProfiles.add(player1.getUsername());
        createUserProfile(player1, player1.getName(),player1.getUsername());
        player1.addCharacter("Archer",new Character("Ranger", 115, 14, 5, 8, 10));
        player1.addCharacter("Knight",new Character("Squire", 85, 8, 9, 7, 8));
        player1.addCharacter("Mage",new Character("Warlock", 100, 12, 7, 10, 12));
        player1.addCharacter("Healer",new Character("Medic", 125, 12, 9, 10, 7));
        player1.addCharacter("MythicalCreature",new Character("Dragon", 120, 12, 14, 15, 8));
        player1.addEquipment("Archer","Ranger",new Equipment("Chainmail", 70, 0, 1, 0, -1, "Armour"));
        player1.addEquipment("Healer","Medic",new Equipment("Amulet", 200, 0, -1, 1, 1, "Artefacts"));


        //Player player2= new Player("Nimash", "nimash123",2, 0,20,"MarshLand");
      //  userProfiles.add(player2.getUsername());
       // createUserProfile(player2, player2.getName(),player2.getUsername());
        System.out.println(" ---------------------------------------------------------------------------------------");
        System.out.println("|                            Welcome to Mystic Mayhem                                   |");
        System.out.println(" ---------------------------------------------------------------------------------------");
        Scanner obj_1 = new Scanner(System.in);
        Scanner obj_2 = new Scanner(System.in);
        Scanner obj_3 = new Scanner(System.in);
        System.out.println("---------------------------  CREATE YOUR PLAYER PROFILE ---------------------------------");
        System.out.println("Enter Player Name :");
        String player_name = obj_1.nextLine();
        System.out.println("Enter User Name :");
        String user_name = obj_2.nextLine();
        System.out.println("Choose Your War Ground :");
        System.out.println("1.Highlanders, 2.Marshlanders, 3.SunChildren, 4.Mystics \n");
        String war_ground = obj_3.nextLine();
        Player player2= new Player(player_name,user_name,war_ground);
        userProfiles.add(player2.getUsername());
        createUserProfile(player2, player2.getName(),player2.getUsername());
        Scanner obj_7 = new Scanner(System.in);

        System.out.println("Category 1 : Shooter , Squire , Warlock , Soother , Dragon");
        System.out.println("Category 2 : Shooter , Squire , Illusionist , Soother , Dragon");
        System.out.println("Choose Your Army >>> Press 1 for Category 1.   Press 2 for Category 2.");

        int choice = obj_7.nextInt();

        if(choice==1)
        {

            player2.addCharacter("Archer",new Character("Shooter", 80, 11, 40, 6, 9));
            player2.addCharacter("Knight",new Character("Squire", 85, 8, 9, 7, 8));
            player2.addCharacter("Mage",new Character("Warlock", 100, 12, 7, 10, 12));
            player2.addCharacter("Healer",new Character("Soother", 95, 10, 8, 9, 6));
            player2.addCharacter("MythicalCreature",new Character("Dragon", 120, 12, 14, 15, 8));
            player2.setGoldCoins(20);
            System.out.println("New Goldcoin count: "+player2.getGoldCoins());

        }
        else if(choice==2)
        {
            player2.addCharacter("Archer",new Character("Shooter", 80, 11, 40, 6, 9));
            player2.addCharacter("Knight",new Character("Squire", 85, 8, 9, 7, 8));
            player2.addCharacter("Mage",new Character("Illusionist", 120, 13, 8, 12, 14));
            player2.addCharacter("Healer",new Character("Soother", 95, 10, 8, 9, 6));
            player2.addCharacter("MythicalCreature",new Character("Dragon", 120, 12, 14, 15, 8));
            player2.setGoldCoins(0);
            System.out.println("New Goldcoin count: "+ player2.getGoldCoins());


        }

//        // Create your player profile and customize itSystem.out.println("\nTurn " + (count + 1) + ": GeraltofRivia");
//        Player player2 = new Player("nimash", "nimash112");
//        createUserProfile(player2,player2.getName(),player2.getUsername());
//        System.out.println("Now you want to select your Army\n");
//        player2.buyCharacter(new Character("Shooter", 80, 11, 4, 6, 9));
//        player2.buyCharacter(new Character("Squire", 85, 8, 9, 7, 8));
//        player2.buyCharacter(new Character("Warlock", 100, 12, 7, 10, 12));
//        player2.buyCharacter(new Character("Soother", 95, 10, 8, 9, 6));
//        player2.buyCharacter(new Character("Dragon", 120, 12, 14, 15, 8));
//        boolean buyEquipment=player2.buyEquipment();

        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                // For Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // For Linux and macOS
                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error while clearing the console: " + e.getMessage());
        }

        System.out.println(" ---------------------------------------------------------------------------------------");
        System.out.println("|                              Mystic Mayhem                                            |");
        System.out.println(" ---------------------------------------------------------------------------------------");


        while (true){
            try {
                final String os = System.getProperty("os.name");

                if (os.contains("Windows")) {
                    // For Windows
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    // For Linux and macOS
                    new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
                }
            } catch (Exception e) {
                System.out.println("Error while clearing the console: " + e.getMessage());
            }
            System.out.println(" ---------------------------------------------------------------------------------------");
            System.out.println("|                              Mystic Mayhem                                            |");
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("What's Next");
            System.out.println("        1. Battle\n" +
                    "        2. Buy Hero\n" +
                    "        3. Sell Hero\n" +
                    "        4. Buy Equipment\n" +
                    "        5. Show Heroes\n" +
                    "        6. Show Gold Coins\n");
            System.out.println("Choose between  1/2/3/4/5/6/7/8/9 ");
            Scanner input=new Scanner(System.in);
            int options=input.nextInt();


            try {
                final String os = System.getProperty("os.name");

                if (os.contains("Windows")) {
                    // For Windows
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    // For Linux and macOS
                    new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
                }
            } catch (Exception e) {
                System.out.println("Error while clearing the console: " + e.getMessage());
            }

            if(options==1){
                System.out.println(" ---------------------------------------------------------------------------------------");
                System.out.println("|                              Mystic Mayhem                                            |");
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("\n");
                HashMap<String,Character> playArmy1=player1.army1;
                HashMap<String,Character> playArmy2=player2.army1;

                Battle.performTurn(playArmy1,playArmy2,player_name);
//                try {
//                    for(int i = 3; i > 0; i--) {
//                        System.out.println(i);
//                        Thread.sleep(1000);
//                    }    // 1000 milliseconds = 1 second
//                } catch (InterruptedException e) {
//                    // Handle the exception if necessary
//                }
                break;
            } else if (options==2) {
                System.out.println(" ---------------------------------------------------------------------------------------");
                System.out.println("|                              Mystic Mayhem                                            |");
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("\n");
                System.out.println("You don't have enough money to purchase a new character.");
                System.out.println("\n");
                try {
                    for(int i = 3; i > 0; i--) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }     // 1000 milliseconds = 1 second
                } catch (InterruptedException e) {
                    // Handle the exception if necessary
                }
                continue;
            } else if (options==3) {
                System.out.println(" ---------------------------------------------------------------------------------------");
                System.out.println("|                              Mystic Mayhem                                            |");
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("\n");
                System.out.println("What character you want to sell? Input Number");
                System.out.println("1.Archers 2.Knights 3.Mages 4.Healers 5.MythicaCreatures");
                Scanner input02 = new Scanner(System.in);
                int sellCharacterOne=input02.nextInt();
                player2.sellCharacter(sellCharacterOne);
                System.out.println("\n");
                try {
                    for(int i = 3; i > 0; i--) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }     // 1000 milliseconds = 1 second
                } catch (InterruptedException e) {
                    // Handle the exception if necessary
                }
                continue;
            } else if (options==4) {
                System.out.println(" ---------------------------------------------------------------------------------------");
                System.out.println("|                              Mystic Mayhem                                            |");
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("\n");
                player2.buyEquipment();
                System.out.println("\n");
                try {
                    for(int i = 3; i > 0; i--) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }     // 1000 milliseconds = 1 second
                } catch (InterruptedException e) {
                    // Handle the exception if necessary
                }
                continue;
            } else if (options==5) {
                System.out.println(" ---------------------------------------------------------------------------------------");
                System.out.println("|                              Mystic Mayhem                                            |");
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("\n");
                player2.showHeroes();
                System.out.println("\n");
                try {
                    for(int i = 3; i > 0; i--) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }     // 1000 milliseconds = 1 second
                } catch (InterruptedException e) {
                    // Handle the exception if necessary
                }
                continue;
            } else if (options==6) {
                System.out.println(" ---------------------------------------------------------------------------------------");
                System.out.println("|                              Mystic Mayhem                                            |");
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("\n");
                System.out.println("Goldcoin Count: "+player2.getGoldCoins());
                System.out.println("\n");
                try {
                    for(int i = 3; i > 0; i--) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }     // 1000 milliseconds = 1 second
                } catch (InterruptedException e) {
                    // Handle the exception if necessary
                }
                continue;
            }
        }


//        // Challenge whitewolf to battle
//        Battle battle = new Battle(player1, player2);
//        BattleOutcome outcome = battle.getOutcome();
//
//        // Print battle outcomes
//        System.out.println(player1.getName() + " vs. " + player2.getName());
//        if (outcome == BattleOutcome.DRAW) {
//            System.out.println("Draw!");
//        } else if (outcome == BattleOutcome.PLAYER_ONE_WINS) {
//            System.out.println(player1.getName() + " wins!");
//        } else {
//            System.out.println(player2.getName() + " wins!");
//        }
//        System.out.println(player1.getName() + " XP: " + player1.getXP() + " Gold coins: " + player1.getGoldCoins());
//        System.out.println(player2.getName() + " XP: " + player2.getXP() + " Gold coins: " + player2.getGoldCoins());

    }
}