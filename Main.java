public class Main {

public static void main(String[] args) {
    Produk p = new Elektronik("kulkas", 5000000, 5, 4,"polytron");
    Produk p2 = new Makanan("roti", 500000, 50, "2030");
    Kasir k = new Kasir("dinda");

    p.tampilInfo();
    k.transaksi(p,1); // polymorphism

    System.out.println();
    System.out.println();
    p2.tampilInfo();
    k.transaksi(p2,10);
}
}