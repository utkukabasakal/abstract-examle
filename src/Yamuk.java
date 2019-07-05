public class Yamuk extends Geometrik{

    public double taban;
    public double yukseklik;
    public double tavan;
    public Yamuk(String isim, double taban, double tavan, double yukseklik) {
        super(isim);
        this.taban=taban;
        this.tavan=tavan;
        this.yukseklik=yukseklik;
    }
    @Override
    public double hesaplaAlan(){
        // TODO Auto-generated method stub
        return this.yukseklik*(taban+tavan)/2;
    }


}
