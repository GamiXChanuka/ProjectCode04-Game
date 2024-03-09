public class Healers extends  Categories{
    double  sellPrice;
    double buyPrice;
    public static String healerName;
    public void setHealer(String Name){
        healerName=Name;
        switch (Name){
            case "Soother":
                this.name="Soother";
                this.price=95;
                this.attack=10;
                this.defence=8;
                this.health=9;
                this.speed=6;
            case "Medic":
                this.name="Medic";
                this.price=125;
                this.attack=12;
                this.defence=9;
                this.health=10;
                this.speed=7;
            case "Alchemist":
                this.name="Alchemist";
                this.price=150;
                this.attack=13;
                this.defence=13;
                this.health=13;
                this.speed=13;
            case "Saint":
                this.name="Saint";
                this.price=200;
                this.attack=16;
                this.defence=14;
                this.health=17;
                this.speed=9;
            case "Lightbringer":
                this.name="Lightbringer";
                this.price=260;
                this.attack=17;
                this.defence=15;
                this.health=19;
                this.speed=12;
        }
    }
    public double buyHealer(){
        buyPrice=this.price;
        return buyPrice;
    }
    public double sellHealer(){
        sellPrice=this.price*0.9;
        return sellPrice;
    }


}
