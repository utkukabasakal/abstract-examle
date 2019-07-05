
public class Test {
    public static void main(String[] args){
        Dikdortgen dikdortgen = new Dikdortgen("Dikdortgen : ",6,5);
        System.out.println(dikdortgen.sekilAdi + " = " + dikdortgen.hesaplaAlan());
        Kare kare = new Kare("Kare : ",5);
        System.out.println(kare.sekilAdi+ " = "+ kare.hesaplaAlan());
        Ucgen ucgen =new Ucgen("Ucgen : ",8,5);
        System.out.println(ucgen.sekilAdi+ " = " +ucgen.hesaplaAlan());
        Yamuk yamuk =new Yamuk("Yamuk : ",8,10,6);
        System.out.println(yamuk.sekilAdi + " = " + yamuk.hesaplaAlan());
    }
}