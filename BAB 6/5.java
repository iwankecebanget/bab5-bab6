public class phone {
    private string merk;
    private int harga;
    public phone() {
    }
    public phone(string merk){
        this.merk = merk;
    }
    public phone(string merk, int harga){
        this.merk = merk;
        this.harga = harga;
    }
    public void lihat phone(){
        system.out.println("merk: " + merk);
        system.out.println("harga : " + harga);
        system.out.println("");
    }
}
public class DemoOverLoading{
    public static void main(String[] args){
        system.out.println("");
        phone p1 = new Phone();
        phone p2 = new Phone("nokia");
        phone p3 = new Phone("sony Ericsoon"500);
system.out.println("perbedaan output dari masing-masing konstuktor");
        p1.lihatPhone();
        p2.lihatPhone();
        p3.lihatPhone();

        phone p4, p5;
        p4=new Phone();
        p5=new Phone();
        p4.isiphone("samsung");
        p5.isiphone("samsung",5000);
        system.out.println("perbedaan output dari masing-masing method");
        p4.lihatPhone();
        p5.lihatPhone();
    }
}