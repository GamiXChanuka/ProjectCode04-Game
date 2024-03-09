import java.sql.SQLOutput;
import java.util.Scanner;

public class SelectArmy extends Equipment{
    public void newPlayerArcher(){
        Archers archer1=new Archers();
        System.out.println("New Player Archer:\n");
        System.out.println("Archer1:\nName:Shooter\nPrice:80\nAttack:11\nDefence:4\nHealth:6\nSpeed:9\n");
        archer1.setArcher("shooter");
    }
    public void newPlayerKnight(){
        Knights knight1=new Knights();
        System.out.println("New Player Knight:\n");
        System.out.println("Knight1:\nName:Squire\nPrice:85\nAttack:8\nDefence:9\nHealth:7\nSpeed:8\n");
        knight1.setKnight("Squire");
    }
    public void newPlayerMage(){
        Mages mage1=new Mages();
        System.out.println("New Player Mage(choose):\n");
        System.out.println("Mage1:\nName:Warlock\nPrice:100\nAttack:12\nDefence:7\nHealth:10\nSpeed:12\n");
        System.out.println("Mage2:\nName:Illusionist\nPrice:120\nAttack:13\nDefence:8\nHealth:12\nSpeed:14\n");
        System.out.print("Select your mage Number: 1 or 2 \n");
        Scanner input=new Scanner(System.in);
        int newPlayerMageNumber=input.nextInt();
        switch(newPlayerMageNumber){
            case 1:
                mage1.setMage("Warlock");
            case 2:
                mage1.setMage("Illusionist");
        }
    }
    public void newPlayerHealer(){
        Healers healer1=new Healers();
        System.out.println("\nNew Player Healer:\n");
        System.out.println("Healer1:\nName:Soother\nPrice:95\nAttack:10\nDefence:8\nHealth:9\nSpeed:6\n");
        healer1.setHealer("Soother");
    }
    public void newPlayerMythicalCreature(){
        MythicalCreatures mythicalCreature1=new MythicalCreatures();
        System.out.println("New Player MythicalCreature:\n");
        System.out.println("MythicalCreature1:\nName:Dragon\nPrice:120\nAttack:12\nDefence:14\nHealth:15\nSpeed:8\n");
        mythicalCreature1.setMythicalCreature("Dragon");

        System.out.println("You can't Use equipments!!!");
        System.out.println("Now  Player");
    }
    public void defaultArcher(String archer,String armour,String artefact){
        Archers archer2=new Archers();
        archer2.setArcher(archer);
    }
    public void defaultKnight(String knight,String armour,String artefact){
        Knights knight2=new Knights();
        knight2.setKnight(knight);
    }
    public void defaultMage(String mage,String armour,String artefact) {
        Mages mage2=new Mages();
        mage2.setMage(mage);
    }
    public void defaultHealer(String healer,String armour,String artefact){
        Healers healer2=new Healers();
        healer2.setHealer(healer);

    }
    public void defaultMythicalCreature(String mythicalCreature,String armour,String artefact){
        MythicalCreatures mythicalCreature2=new MythicalCreatures();
        mythicalCreature2.setMythicalCreature(mythicalCreature);

    }

//    public  void changeArcher(int goldCoins){
//        archer1.sellArcher();
//        System.out.println("Select the Archer no:\n");
//        System.out.println("Archer1:\nName:Shooter\nPrice:80\nAttack:11\nDefence:4\nHealth:6\nSpeed:9\n");
//        System.out.println("Archer2:\nName:Ranger\nPrice:115\nAttack:14\nDefence:5\nHealth:8\nSpeed:10\n");
//        System.out.println("Archer3:\nName:Sunfire\nPrice:160\nAttack:15\nDefence:5\nHealth:7\nSpeed:14\n");
//        System.out.println("Archer4:\nName:Zing\nPrice:200\nAttack:16\nDefence:9\nHealth:11\nSpeed:14\n");
//        System.out.println("Archer5:\nName:Saggitarius\nPrice:230\nAttack:18\nDefence:7\nHealth:12\nSpeed:17\n");
//        Scanner inputA=new Scanner(System.in);
//        int archerNumber=inputA.nextInt();
//        switch(archerNumber){
//            case 1:
//                archer1.setArcher("shooter");
//            case 2:
//                archer1.setArcher("Ranger");
//            case 3:
//                archer1.setArcher("Sunfire");
//            case 4:
//                archer1.setArcher("Zing");
//            case 5:
//                archer1.setArcher("Saggitarius");
//        }
//
//    }
//    public  void changeKnight(){
//        System.out.println("Select the Knight no:\n");
//        System.out.println("Knight1:\nName:Squire\nPrice:85\nAttack:8\nDefence:9\nHealth:7\nSpeed:8\n");
//        System.out.println("Knight2:\nName:Cavalier\nPrice:110\nAttack:10\nDefence:12\nHealth:7\nSpeed:10\n");
//        System.out.println("Knight3:\nName:Templar\nPrice:155\nAttack:14\nDefence:16\nHealth:12\nSpeed:12\n");
//        System.out.println("Knight4:\nName:Zoro\nPrice:180\nAttack:17\nDefence:16\nHealth:13\nSpeed:14\n");
//        System.out.println("Knight5:\nName:Swiftblade\nPrice:250\nAttack:18\nDefence:20\nHealth:17\nSpeed:13\n");
//        Scanner inputB=new Scanner(System.in);
//        int knightNumber=inputB.nextInt();
//        switch(knightNumber){
//            case 1:
//                knight1.setKnight("Squire");
//            case 2:
//                knight1.setKnight("Cavalier");
//            case 3:
//                knight1.setKnight("Templar");
//            case 4:
//                knight1.setKnight("Zoro");
//            case 5:
//                knight1.setKnight("Swiftblade");
//        }
//    }
//    public  void changeMage(){
//        System.out.println("Select the Mage no:\n");
//        System.out.println("Mage1:\nName:Warlock\nPrice:100\nAttack:12\nDefence:7\nHealth:10\nSpeed:12\n");
//        System.out.println("Mage2:\nName:Illusionist\nPrice:120\nAttack:13\nDefence:8\nHealth:12\nSpeed:14\n");
//        System.out.println("Mage3:\nName:Enchanter\nPrice:160\nAttack:16\nDefence:10\nHealth:13\nSpeed:16\n");
//        System.out.println("Mage4:\nName:Conjurer\nPrice:195\nAttack:18\nDefence:15\nHealth:14\nSpeed:12\n");
//        System.out.println("Mage5:\nName:Eldritch\nPrice:270\nAttack:19\nDefence:17\nHealth:18\nSpeed:14\n");
//        Scanner inputC=new Scanner(System.in);
//        int mageNumber=inputC.nextInt();
//        switch(mageNumber){
//            case 1:
//                mage1.setMage("Warlock");
//            case 2:
//                mage1.setMage("Illusionist");
//            case 3:
//                mage1.setMage("Enchanter");
//            case 4:
//                mage1.setMage("Conjurer");
//            case 5:
//                mage1.setMage("Eldritch");
//        }
//
//    }
//    public  void changeHealer(){
//        System.out.println("Select the Healer no:\n");
//        System.out.println("Healer1:\nName:Soother\nPrice:95\nAttack:10\nDefence:8\nHealth:9\nSpeed:6\n");
//        System.out.println("Healer2:\nName:Medic\nPrice:125\nAttack:12\nDefence:9\nHealth:10\nSpeed:7\n");
//        System.out.println("Healer3:\nName:Alchemist\nPrice:150\nAttack:13\nDefence:13\nHealth:13\nSpeed:13\n");
//        System.out.println("Healer4:\nName:Saint\nPrice:200\nAttack:16\nDefence:14\nHealth:17\nSpeed:9\n");
//        System.out.println("Healer5:\nName:Lightbringer\nPrice:260\nAttack:17\nDefence:15\nHealth:19\nSpeed:12\n");
//        Scanner inputD=new Scanner(System.in);
//        int healerNumber=inputD.nextInt();
//        switch(healerNumber){
//            case 1:
//                healer1.setHealer("Soother");
//            case 2:
//                healer1.setHealer("Medic");
//            case 3:
//                healer1.setHealer("Alchemist");
//            case 4:
//                healer1.setHealer("Saint");
//            case 5:
//                healer1.setHealer("Lightbringer");
//        }
//
//    }
//    public  void changeMythicalCreature(){
//        System.out.println("Select the MythicalCreature no:\n");
//        System.out.println("MythicalCreature1:\nName:Dragon\nPrice:120\nAttack:12\nDefence:14\nHealth:15\nSpeed:8\n");
//        System.out.println("MythicalCreature2:\nName:Basilisk\nPrice:165\nAttack:15\nDefence:11\nHealth:10\nSpeed:12\n");
//        System.out.println("MythicalCreature3:\nName:Hydra\nPrice:205\nAttack:12\nDefence:16\nHealth:15\nSpeed:11\n");
//        System.out.println("MythicalCreature4:\nName:Phoenix\nPrice:275\nAttack:17\nDefence:13\nHealth:17\nSpeed:19\n");
//        System.out.println("MythicalCreature5:\nName:Pegasus\nPrice:340\nAttack:14\nDefence:18\nHealth:20\nSpeed:20\n");
//        Scanner inputE=new Scanner(System.in);
//        int mythicalCreatureNumber=inputE.nextInt();
//        switch(mythicalCreatureNumber){
//            case 1:
//                mythicalCreature1.setMythicalCreature("Dragon");
//            case 2:
//                mythicalCreature1.setMythicalCreature("Basilisk");
//            case 3:
//                mythicalCreature1.setMythicalCreature("Hydra");
//            case 4:
//                mythicalCreature1.setMythicalCreature("Phoenix");
//            case 5:
//                mythicalCreature1.setMythicalCreature("Pegasus");
//        }
//    }

}