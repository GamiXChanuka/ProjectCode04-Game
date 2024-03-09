public class Archers extends  Categories{
    public static String archerName;
    double  sellPrice;
    int buyPrice;
    public void setArcher(String Name){
        archerName=Name;
        switch (Name){
            case "Shooter":
                this.name="Shooter";
                this.price=80;
                //goldCoins = goldCoins - this.price;
                this.attack=11;
                this.defence=4;
                this.health=6;
                this.speed=9;
                //return goldCoins;
                break;
            case "Ranger":
                this.name="Ranger";
                this.price=115;
                this.attack=14;
                this.defence=5;
                this.health=8;
                this.speed=10;
                break;
            case "Sunfire":
                this.name="Sunfire";
                this.price=160;
                this.attack=15;
                this.defence=5;
                this.health=7;
                this.speed=14;
                break;
            case "Zing":
                this.name="Zing";
                this.price=200;
                this.attack=16;
                this.defence=9;
                this.health=11;
                this.speed=14;
                break;
            case "Saggitarius":
                this.name="Saggitarius";
                this.price=230;
                this.attack=18;
                this.defence=7;
                this.health=12;
                this.speed=17;
                break;
        }
    }
    public int buyArcher(){
        buyPrice=this.price;
        return buyPrice;
    }
    public double sellArcher(){
        sellPrice=this.price*0.9;
        return sellPrice;
    }


}
