package Latihan;

class Buku {
    String judul;
    String penulis;

    Buku (String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    void display() {
        System.out.println("\nJudul Buku\t: "+ this.judul);
        System.out.println("Penulis Buku\t: "+ this.penulis);
    }
}

public class publicprv {
    public static void main(String[] args) {
        Buku databuku1 = new Buku("One Piece", "Eichiro Oda");
        databuku1.display();
    }
}
