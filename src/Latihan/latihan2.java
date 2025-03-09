package Latihan;

class Playerr{
    private String name;
    private int baseHealth;
    private Armorr armor;
    private int level;
    private int increaseHealth;
    
    public Playerr(String name){
        this.name = name;
        this.baseHealth = 100;
        this.level = 1;
        this.increaseHealth = 20;

    }
public void display(){
    System.out.println("Name : " + this.name);
    System.out.println("Health : " + this.maxhealth());
}
public void setArmor(Armorr armor){
    this.armor = armor;
}
public int maxhealth (){
    return this.baseHealth + this.level*this.increaseHealth + this.armor.getAddArmor();
}
}

class Armorr{
    private String name;
    private int Health;
    private int Str;

    public Armorr (String name, int Health, int Str){
        this.name = name;
        this.Health = Health;
        this.Str = Str;
    }

    public int getAddArmor(){
        return this.Str*10 + this.Health; 
    }
}

public class latihan2 {
    public static void main(String[] args) {
        Playerr player1 = new Playerr("Zero");
        Armorr armor1 = new Armorr("Besi", 100, 5);
        player1.setArmor(armor1);
        player1.display();


    }
}
