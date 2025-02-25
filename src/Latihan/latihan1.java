package Latihan;

//player
class  Player{
    String name;
    double health;
    
    //object member
    Weapon weapon;
    Armor armor;
    Player (String name, double health){
        this.name = name; 
        this.health = health;

    }
    void attacking (Player opponent){
        double attackPw = this.weapon.attackPw;
        System.out.println(this.name + " attacking " + opponent.name + " With Power "+ attackPw);
        opponent.defence(attackPw);
    }
    void defence (double attackPw){
        System.out.println(this.name + " Gots damage "+ attackPw);
    }
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    void equipArmor(Armor armor){
        this.armor = armor;
    }
    void dislpay(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }

}
//senjata
class Weapon{
    double attackPw;
    String name;
    Weapon(String name, double attack){
        this.attackPw = attack;
        this.name = name;
    }
    void display(){
        System.out.println("Weapon : " + this.name + " , Attack : " + this.attackPw);
    }
}
//armor
class Armor{
    double defence;
    String name;

    Armor(String name, double defence){
        this.name = name;
        this.defence = defence;
    }
    void display(){
        System.out.println("Armor : " + this.name + " , Defence : " + this.defence);
    }
}

public class latihan1 {
    
    public static void main(String[] args) {
        //object player
        Player player1 = new Player("Jono",100);
        Player player2 = new Player("Danang",80);
        
        //object weapon
        Weapon sword = new Weapon("sword", 15);
        Weapon Bow = new Weapon("Bow", 30);

        //object armor 
        Armor besi = new Armor("Iron", 10);
        Armor Shirt = new Armor("Leather", 2);

        //perlengkapan player 1
        player1.equipWeapon(sword);
        player1.equipArmor(besi);
        player1.dislpay();

        //Player2
        player2.equipWeapon(Bow);
        player2.equipArmor(Shirt);
        player2.dislpay();

        System.out.println("\nPERTEMPURAN");
        player1.attacking(player2);
        


    }
}
