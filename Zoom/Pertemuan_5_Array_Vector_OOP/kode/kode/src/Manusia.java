public class Manusia implements HidupBebas{

    private String nama;
    private String alamat;
    
    public Manusia() {
        this.nama = "";
        this.alamat = "";
    }

    public Manusia(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void perkenalanDiri(){
        System.out.println("Halo semua. Perkenalkan saya " + nama + ".Saya tinggal di " + alamat);
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public void jalan() {
        // TODO Auto-generated method stub
        System.out.println("Manusia jalan");
    }

    @Override
    public void makan() {
        // TODO Auto-generated method stub
        System.out.println("Manusia makan");
    }
}
