public class Knights extends  Categories{
    double  sellPrice;
    double buyPrice;
    public void setKnight(String name){
        switch (name){
            case "Squire":
                this.name="Squire";
                this.price=85;
                this.attack=8;
                this.defence=9;
                this.health=7;
                this.speed=8;
            case "Cavalier":
                this.name="Cavalier";
                this.price=110;
                this.attack=10;
                this.defence=12;
                this.health=7;
                this.speed=10;
            case "Templar":
                this.name="Templar";
                this.price=155;
                this.attack=14;
                this.defence=16;
                this.health=12;
                this.speed=12;
            case "Zoro":
                this.name="Zoro";
                this.price=180;
                this.attack=17;
                this.defence=16;
                this.health=13;
                this.speed=14;
            case "Swiftblade":
                this.name="Swiftblade";
                this.price=250;
                this.attack=18;
                this.defence=20;
                this.health=17;
                this.speed=13;
        }
    }
    public double buyKnight(){
        buyPrice=this.price;
        return buyPrice;
    }
    public double sellKnight(){
        sellPrice=this.price*0.9;
        return sellPrice;
    }
}
