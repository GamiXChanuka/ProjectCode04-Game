public class MythicalCreatures extends  Categories{
    double  sellPrice;
    double buyPrice;
    public static String mythicalCreatureName;
    public void setMythicalCreature(String Name){
        mythicalCreatureName=Name;
        switch (Name){
            case "Dragon":
                this.name="Dragon";
                this.price=120;
                this.attack=12;
                this.defence=14;
                this.health=15;
                this.speed=8;
            case "Basilisk":
                this.name="Basilisk";
                this.price=165;
                this.attack=15;
                this.defence=11;
                this.health=10;
                this.speed=12;
            case "Hydra":
                this.name="Hydra";
                this.price=205;
                this.attack=12;
                this.defence=16;
                this.health=15;
                this.speed=11;
            case "Phoenix":
                this.name="Phoenix";
                this.price=275;
                this.attack=17;
                this.defence=13;
                this.health=17;
                this.speed=19;
            case "Pegasus":
                this.name="Pegasus";
                this.price=340;
                this.attack=14;
                this.defence=18;
                this.health=20;
                this.speed=20;
        }
    }
    public double buyMythicalCreature(){
        buyPrice=this.price;
        return buyPrice;
    }
    public double sellMythicalCreature(){
        sellPrice=this.price*0.9;
        return sellPrice;
    }


}
