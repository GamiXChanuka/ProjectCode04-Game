public class Player extends SelectArmy{
    String playGround;
    public static void createNewPlayerArmy(Player player){
        System.out.println("Select Army : ");
        player.newPlayerArcher();
        player.newPlayerKnight();
        player.newPlayerMage();
        player.newPlayerHealer();
        player.newPlayerMythicalCreature();
    }
    public void defaultArmy(Player player,String archer,String armour1,String artefact1,String knight,String armour2,String artefact2,String mage,String armour3,String artefact3,String healer,String armour4,String artefact4,String mythicalCreature,String armour5,String artefact5){
        player.defaultArcher(archer,armour1,artefact1);
        player.defaultKnight(knight,armour2,artefact2);
        player.defaultMage(mage,armour3,artefact3);
        player.defaultHealer(healer,armour4,artefact4);
        player.defaultMythicalCreature(mythicalCreature,armour5,artefact5);
    }

}
