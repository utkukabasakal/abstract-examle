public class Dikdortgen extends Geometrik{
    public double tavan;
    public double taban;


    public Dikdortgen(String isim, double taban, double tavan) {
        super(isim);
        this.taban=taban;
        this.tavan=tavan;
    }
    @Override
    public double hesaplaAlan() {
        // TODO Auto-generated method stub
        return tavan*taban;
    }

}
