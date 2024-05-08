public class Dosen extends Manusia {

    private String NID;

    public Dosen() {
        this.NID = "";
    }

    public Dosen(String nama, String alamat, String NID) {
        super(nama, alamat);
        this.NID = NID;
    }

    public void menilaiUjian(){

    }

    @Override
    public void perkenalanDiri(){
        System.out.println("Halo semua. Perkenalkan saya " + getNama() + ".Saya tinggal di " + getAlamat() + ". Kode ID dosen saya adalah " + NID + ".");
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }
}
