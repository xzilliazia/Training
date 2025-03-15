package Latihan;

class Playerr{
    private String name;
    private int baseHealth;
    private int level;
    private int baseAttack;
    private int increaseAttack;
    private int increaseHealth;
    private int TotalDamage;
    private Armorr armor;
    private Weapoon weapon;
    
    public Playerr(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 50;
        this.level = 1;
        this.increaseHealth = 20;
        this.increaseAttack = 20;

    }

    public void display(){
        System.out.println("");
        System.out.println("Name\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        this.weapon.dislpay();
        this.armor.dislpay();
        System.out.println("Health\t\t: " + this.getHealth() + "/"+ this.maxhealth());
        System.out.println("Attack\t\t: " + this.getattackPower());
    }
    public String GetName(){
        return this.name;
    }
    
    public int getHealth(){
        return this.maxhealth() - this.TotalDamage;
    }

    public void attack(Playerr opponent){
        int damage = this.getattackPower();
       
        System.out.println("\nPlayer "+ this.name + " Attack "+ opponent.GetName() + " With " + damage + "\n");
        opponent.defence(damage);
    }
    
    public void defence(int damage){

        int defencePower = damage - this.armor.getDefencePower();
        int deltaDamage;

        if (damage > defencePower){
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }
        
        this.TotalDamage += deltaDamage;
    }

    private int getattackPower(){
        return this.baseAttack + this.level*this.increaseAttack + this.weapon.getAttack();
    }

    void equipArmorr(Armorr armor){
        this.armor = armor;
    }

    void equipWeapoon(Weapoon weapon){
        this.weapon = weapon;
    }

    public void setArmor(Armorr armor){
        this.armor = armor;
    }

    public void setWeapon(Weapoon weapon){
        this.weapon = weapon;
    }

    public int maxhealth (){
        return this.baseHealth + this.level*this.increaseHealth + this.armor.getAddArmor();
    }

    private void levelUp(){
        this.level++;
    }
}

class Weapoon{
    private String name;
    private int attackPower;

    public Weapoon (String name, int attackPower){
        this.name = name;
        this.attackPower = attackPower;         
    }
    public int getAttack(){
        return this.attackPower;
    }
    void dislpay(){
        System.out.println("Weapon\t\t: "+ this.name);
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
    void dislpay(){
        System.out.println("Armor\t\t: "+ this.name);
    }
    public int getDefencePower(){
        return this.Str*2;
    }
}

public class latihan2 {
    public static void main(String[] args) {
        Playerr player1 = new Playerr("Zero");
        Armorr armor1 = new Armorr("Besi", 100, 5);
        Weapoon weapon1 = new Weapoon("Sword", 10);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Playerr player2 = new Playerr("Nero");
        Armorr armor2 = new Armorr("Diamond", 230, 9);
        Weapoon weapon2 = new Weapoon("Katana", 12);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player1.attack(player2);
        player1.display();
        player2.display();
    }
}
