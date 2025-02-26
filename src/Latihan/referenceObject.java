package Latihan;

class Buku {
    String judul;
    String penulis;

    //construktor
    Buku (String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    //display
    void display() {
        System.out.println("\nJudul Buku\t: "+ this.judul);
        System.out.println("Penulis Buku\t: "+ this.penulis);
    }
}

public class referenceObject {
    public static void main(String[] args) {
        Buku databuku1 = /*ini object*/new Buku("One Piece", "Eichiro Oda");
        databuku1.display();
        //address object
        String addressObject1 = Integer.toHexString(System.identityHashCode(databuku1));
        System.out.println(addressObject1);
        
        //assignment object
        Buku dataBuku2 = databuku1;
        dataBuku2.display();
        String addressObject2 = Integer.toHexString(System.identityHashCode(dataBuku2));
        System.out.println(addressObject2);
        
        /*hasil diatas menjadi masalah karena 
        variabel dataBuku2 bukan menduplikat tetapi 
        membuat variable baru lalu isi object dan referensi tetap sama*/
        
        //jika 
       /*  Buku dataBuku2 = (object)new Buku("One Piece", "Eichiro Oda2");
        dia akan berbeda karena referensi databuku2 akan ke object sampingnya */
        
        //fungsi
        fungsi(dataBuku2);
        databuku1.display();
        dataBuku2.display();


    }
public static void fungsi(Buku databuku){
    String addressDataBuku = Integer.toHexString(System.identityHashCode(databuku));
    System.out.println("\naddress dalam fungsi "+ addressDataBuku);
    databuku.penulis = "Haruski";
}
/*Hati hati dengan- Buku dataBuku2 = databuku1;- karena semua yang berhubungan 
 dengan databuku2 tidak akan menduplikat dan menggunakan referensi yang sama*/
}
