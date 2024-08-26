import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
class Battle {
    private Player player1;
    private Player player2;
    private int currentPlayer;
    private int turns;

    public Battle(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = 1; // Player 1 starts
        this.turns = 10;
    }

    public static String speedTest(HashMap<String, Character> army) {
        List<String> armyChara = Arrays.asList("Archer", "Knight", "Mage", "Healer", "MythicalCreature");
        double max=0;
        String maxSpeechCharacter=null;
        for(int i = 0; i < armyChara.size(); i++) {
            String warCharacter;
            warCharacter = armyChara.get(i);
            if(army.get(warCharacter).health<=0){
                continue;
            }
            if(max<=army.get(warCharacter).speed){
                max=army.get(warCharacter).speed;
            }
        }
        List<String> prioritySpeed = Arrays.asList("Archer", "Knight", "MythicalCreature", "Mage", "Healer");

        String speedCharacterFinal=null;

        for(int i = 0; i < prioritySpeed.size(); i++){
            String temCharacter1=null;
            temCharacter1= prioritySpeed.get(i);
            if(max==army.get(temCharacter1).speed){
                speedCharacterFinal=temCharacter1;
                break;
            }

        }
        return speedCharacterFinal;
    }

    public static String defenceTest(HashMap<String, Character> army) {
        List<String> armyChara = Arrays.asList("Archer", "Knight", "Mage", "Healer", "MythicalCreature");

        double min=1000;
        String minDefenceCharacter=null;
        for(int i = 0; i < armyChara.size(); i++) {
            String warCharacter;
            warCharacter = armyChara.get(i);
            if(army.get(warCharacter).health<=0){
                continue;
            }
            if(min>=army.get(warCharacter).defense){
                min=army.get(warCharacter).defense;
            }
        }

        List<String> priorityDefence = Arrays.asList("Mage","Knight","Archer","MythicalCreature","Healer");

        String defenceCharacterFinal=null;

        for(int i = 0; i < priorityDefence.size(); i++){

            String temCharacter2=null;
            temCharacter2 = priorityDefence.get(i);
            if(min==army.get(temCharacter2).defense){
                defenceCharacterFinal=temCharacter2;
                break;
            }

        }
        return defenceCharacterFinal;
    }
    public static String healthTest(HashMap<String, Character> army) {
        List<String> armyChara = Arrays.asList("Archer", "Knight", "Mage", "Healer", "MythicalCreature");

        double min=1000;
        String minHealthCharacter=null;
        for(int i = 0; i < armyChara.size(); i++) {
            String warCharacter;
            warCharacter = armyChara.get(i);
            if(army.get(warCharacter).health<=0){
                continue;
            }
            if(min>=army.get(warCharacter).health){
                min=army.get(warCharacter).health;
                minHealthCharacter=warCharacter;
            }
        }
    return minHealthCharacter;
    }
    // Perform a turn in the battle
    public static void performTurn(HashMap<String,Character> characterset1,HashMap<String,Character> characterset2,String temName){ //characterset1=defult
                    System.out.println(" --------------------------------------------");
                    System.out.println("|         "+temName+" vs GeraltofRivia           |");
                    System.out.println(" ---------------------------------------------");
                    DoubleUnaryOperator handleNegativeHealth = health -> health < 0 ? 0 : health;

                    int count=1;
                    while (count <= 10) {
                        System.out.println("Turn "+count+": " +temName);
                        //System.out.println("------------------");
                        String firstAttackerArmy2=speedTest(characterset2);
                        if(firstAttackerArmy2!="Healer"){
                            String firstDefenceArmy2=defenceTest(characterset1);
                            System.out.println(firstAttackerArmy2+" attacks "+ firstDefenceArmy2 );
                            characterset1.get(firstDefenceArmy2).health-=((0.5*characterset2.get(firstAttackerArmy2).attack)-(0.1*characterset1.get(firstDefenceArmy2).defense));
                            System.out.println( firstDefenceArmy2 +"’s health: "+String.format("%.1f",handleNegativeHealth.applyAsDouble(characterset1.get(firstDefenceArmy2).health)));
                            System.out.println( firstAttackerArmy2+"’s health: "+String.format("%.1f",handleNegativeHealth.applyAsDouble(characterset2.get(firstAttackerArmy2).health)));
                        }else if(firstAttackerArmy2=="Healer") {
                            String firstHealwant2=healthTest(characterset2);
                            System.out.println(firstAttackerArmy2+" heal "+ firstHealwant2 );
                            characterset2.get(firstHealwant2).health+=(0.1*characterset2.get(firstAttackerArmy2).attack);
                            System.out.println(firstHealwant2 +"’s health : "+String.format("%.1f",handleNegativeHealth.applyAsDouble(characterset2.get(firstHealwant2).health)));
                            System.out.println(firstAttackerArmy2 +"’s health : "+String.format("%.1f",handleNegativeHealth.applyAsDouble(characterset2.get(firstAttackerArmy2).health)));
                        }

                        System.out.println(".");
                        String firstAttackerArmy1=speedTest(characterset1);
                        if(firstAttackerArmy1!="Healer"){
                            String firstDefencerArmy1=defenceTest(characterset2);
                            System.out.println(firstAttackerArmy2+" attacks "+ firstDefencerArmy1 );
                            characterset2.get(firstDefencerArmy1).health-=(0.5*characterset1.get(firstAttackerArmy1).attack)-(0.1*characterset2.get(firstDefencerArmy1).defense);
                            System.out.println( firstDefencerArmy1 +"’s health: "+String.format("%.1f",handleNegativeHealth.applyAsDouble(characterset2.get(firstDefencerArmy1).health)));
                            System.out.println( firstAttackerArmy1+"’s health: "+String.format("%.1f",handleNegativeHealth.applyAsDouble(characterset1.get(firstAttackerArmy1).health)));
                        }else if(firstAttackerArmy1=="Healer") {
                            String firstHealwant1=healthTest(characterset1);
                            System.out.println(firstAttackerArmy1+" heal "+ firstHealwant1 );
                            characterset1.get(firstHealwant1).health+=(0.1*characterset1.get(firstAttackerArmy1).attack);
                            System.out.println(firstHealwant1 +"’s health : "+String.format("%.1f",handleNegativeHealth.applyAsDouble(characterset1.get(firstHealwant1).health)));
                            System.out.println(firstAttackerArmy1 +"’s health : "+String.format("%.1f",handleNegativeHealth.applyAsDouble(characterset1.get(firstAttackerArmy1).health)));
                        }
                        System.out.println("---------------------");
                        count++;
                        try {
                            Thread.sleep(1000); // 1000 milliseconds = 1 second
                        } catch (InterruptedException e) {
                            // Handle the exception if necessary
                        }
                    }
                    Battle.getOutcome(characterset1,characterset2,temName);

    }


    public static void getOutcome(HashMap<String,Character> characterset1,HashMap<String,Character> characterset2,String temName){
        String winner=null;
        List<String> armyChara = Arrays.asList("Archer", "Knight", "Mage", "Healer", "MythicalCreature");
        int numDied1=0;
        for(int i=0;i<armyChara.size();i++){
            String character=armyChara.get(i);
            if(characterset1.get(character).health<=0){
                numDied1++;
            }
        }
        if(numDied1==5){
            System.out.println("\"The match concluded with "+temName+"'s win.\n");
        }
        int numDied2=0;
        for(int i=0;i<armyChara.size();i++){
            String character=armyChara.get(i);
            if(characterset2.get(character).health<=0){
                numDied1++;
            }
        }
        if(numDied2==5){
            System.out.println("\"The match concluded with GeraltofRivia's win.\"");
        }
        if(numDied1!=5 & numDied2!=5){
            System.out.println("The match ended in a draw.");
        }

    }
}
