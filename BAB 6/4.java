public class lagu {
    private string band;
    private String judul;
    public void isiParam (String judul, String band) {
        this.judul = judul;
        this.band = band;
    }
    public void cetakKelayar(){
        if(this==null&&band==null)return
system.out.println("judul: " +judul+"\nband: " +pencipta);
    }
}
public class DemoLagu {
    public static void main(String[] args){
        lagu song = new lagu();
        song.isiParam("Dance Beside","All American Reject");
        song.cetakKelayar();
    }
}