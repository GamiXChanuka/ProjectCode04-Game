public class Mages extends  Categories{
    double  sellPrice;
    double buyPrice;
    public static String mageName;
    public void setMage(String Name){
        mageName=Name;
        switch (Name){
            case "Warlock":
                this.name="Warlock";
                this.price=100;
                this.attack=12;
                this.defence=7;
                this.health=10;
                this.speed=12;
            case "Illusionist":
                this.name="Illusionist";
                this.price=120;
                this.attack=13;
                this.defence=8;
                this.health=12;
                this.speed=14;
            case "Enchanter":
                this.name="Enchanter";
                this.price=160;
                this.attack=16;
                this.defence=10;
                this.health=13;
                this.speed=16;
            case "Conjurer":
                this.name="Conjurer";
                this.price=195;
                this.attack=18;
                this.defence=15;
                this.health=14;
                this.speed=12;
            case "Eldritch":
                this.name="Eldritch";
                this.price=270;
                this.attack=19;
                this.defence=17;
                this.health=18;
                this.speed=14;
        }
    }
    public double buyMage(){
        buyPrice=this.price;
        return buyPrice;
    }
    public double sellMage(){
        sellPrice=this.price*0.9;
        return sellPrice;
    }



}
