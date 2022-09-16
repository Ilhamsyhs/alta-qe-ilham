public class OOP_MenghitungLuasdanKeliling1 {
    public static void main(String[] args) {
        OOP_MenghitungLuasdanKeliling oop = new OOP_MenghitungLuasdanKeliling();
        System.out.println("Luas");
        System.out.println("Persegi : "+oop.getLuasPersegi());
        System.out.println("Segitiga : "+oop.getLuasSegitiga());
        System.out.println("Persegi Panjang : "+oop.getLuasPersegiPanjang()+"\n");
        System.out.println("Keliling");
        System.out.println("Persegi : "+oop.getKelilingPersegi());
        System.out.println("Segitiga : "+oop.getKelilingSegitiga());
        System.out.println("Persegi Panjang : "+oop.getKelilingPersegiPanjang());
    }
}
