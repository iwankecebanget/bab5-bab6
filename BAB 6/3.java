public class demoManusia {
    public static void main(String[] args) { // program utama
    manusia arrMns[]=new manusia[3]; //buat array of object
        manusia objMns1 = new manusia(); //constructor pertama
        objMns1.setNama("markonah");
        objMns1.setUmur(76);
        manusia objMns2 = new manusia("MatConan"); //constructor kedua
        manusia objMns3 = new manusia("bajuri",45); //constructor ketiga
            arrMns[0] = objMns1;
            arrMns[1] = objMns2;
            arrMns[2] = objMns3;
            for (int i=0; i<3; i++){
                system.out.println("nama: " +arrMns[i].getNama());
                system.out.println("umur: " +arrMns[i].getUmur());
                system.out.println();
            }
    }
}