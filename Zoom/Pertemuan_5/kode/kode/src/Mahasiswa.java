public class Mahasiswa extends Manusia{
    
    private String NIM;

    public Mahasiswa() {
        this.NIM = "";
    }

    public Mahasiswa(String nama, String alamat, String NIM) {
        super(nama, alamat);
        this.NIM = NIM;
    }

    @Override
    public void perkenalanDiri(){
        System.out.println("Halo semua. Perkenalkan saya " + getNama() + ".Saya tinggal di " + getAlamat() + ". Kode NIM mahasiswa saya adalah " + NIM + ".");
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String nIM) {
        this.NIM = nIM;
    }

}
