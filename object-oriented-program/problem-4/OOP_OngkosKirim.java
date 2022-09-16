public class OOP_OngkosKirim {
    public int p = 5;
    public int l = 2;
    public int t = 4;
    public int dim = 50;
    public int kg = 1;
    public int harga1 = 5000;
    public int harga2 = 10000;

    public int getDimensi(){
        return p*l*t;
    }

    public int getOngkir(){
        if (getDimensi() <= dim){

            return harga1 * kg;
        } else {
            return harga2 * kg;
        }
    }


}
