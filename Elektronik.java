public class Elektronik extends Produk {
    int garasansi;
    String merek;

    public Elektronik(String nama, double harga, int stok, int garasansi, String merek) {
        super(nama, harga, stok);
        this.garasansi = garasansi;
        this.merek = merek;
        
    }

    @Override
    public double hitungTotalBayar(int jumlah) {
        return hitungTotalHarga(jumlah) *0.85;
     }

     @Override
     public void tampilInfo(){
        super.tampilInfo();
        System.out.println("garansi" + garasansi);
        System.out.println("merek" + merek);
     }

}