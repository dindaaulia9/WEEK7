public abstract class Produk {
    private String nama;
    private double harga;
    private int stok;

public Produk (String nama, double harga, int stok){
    this.nama = nama;
    this.harga = harga;
    this.stok = stok;
}

public int getStok() {
    return stok;
}

public void setStok(int jumlah){
    stok = stok - jumlah;

}

public void tampilInfo(){
    System.out.println("nama:" + nama);
    System.out.println("harga:" + harga);
    System.out.println("stok:" + stok);
}

public double hitungTotalHarga(int jumlah) {
    return jumlah * harga;
}

public abstract double hitungTotalBayar(int jumlah);
}

