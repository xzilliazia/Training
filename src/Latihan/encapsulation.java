package Latihan;

class Data {
    public int intPublic;
    private int intPrivate;
    private double dbPrivate;

    public Data() {
        this.intPublic = 0; 
        this.intPrivate = 0; 
    }
    void display(){
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.dbPrivate);
    }
    //getter method
    public int getIntPrivate(){
        return this.intPrivate;
    }
    //setter
    public void setDbPrivate(double value){
        this.dbPrivate = value;
    }

}
class Lingkaran{
    private double diameter;

    Lingkaran(double diameter) {   
        this.diameter = diameter;
    }
    //getter
    public double getJari(){
        return this.diameter/2;
    }
    //setter
    public void setJari(double jari){
        this.diameter = jari*2;
    }   
}
public class encapsulation {
    public static void main(String[] args) {
        Data object = new Data();
        //public 
        object.intPublic = 10; //write
        System.out.println("Public: "+ object.intPublic); //read
        
        //read only (we use gatter)
        int angka = object.getIntPrivate();
        System.out.println("getter: "+ angka);
        //write only (we use setter)
         object.setDbPrivate(0.01);
         object.display();

        //write & read using getter and setter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println(object2.getJari());
        object2.setJari(10);
        System.out.println(object2.getJari());
    }
}
