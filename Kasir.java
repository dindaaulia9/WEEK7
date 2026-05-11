public class Kasir {
    private String namaKasir;

    public Kasir (String namaKasir){
        this.namaKasir = namaKasir;
    }

    public void transaksi (Produk p, int jumlah){
        double hargaAkhir = 0.0;

        if(jumlah > p.getStok()) {
            System.out.println("out of stok");
        } else {
            hargaAkhir = p.hitungTotalBayar(jumlah);
            p.setStok(jumlah);
        }

        // syarat polymorphism
        System.out.println("*** Bintang ***");
        System.out.println("nama kasir:" + namaKasir);
        System.out.println("jumlah beli:" + jumlah);
        System.out.println("total harga:" + hargaAkhir);
        System.out.println("sisa Stok:" + p.getStok());
    }
    
}
