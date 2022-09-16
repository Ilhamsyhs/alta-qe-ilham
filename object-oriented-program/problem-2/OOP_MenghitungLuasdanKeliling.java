public class OOP_MenghitungLuasdanKeliling {
    public int sisi = 4;
    public int alas = 3;
    public int tinggi = 4;
    public int panjang = 7;
    public int lebar = 8;

    public int getLuasPersegi(){
        return sisi*sisi;
    }

    public int getLuasSegitiga(){
        return (alas*tinggi)/2;
    }

    public int getLuasPersegiPanjang(){
        return panjang*lebar;
    }

    public int getKelilingPersegi(){
        return sisi*4;
    }

    public int getKelilingSegitiga(){
        return tinggi*3;
    }

    public int getKelilingPersegiPanjang(){
        return (panjang+lebar)*2;
    }
}
