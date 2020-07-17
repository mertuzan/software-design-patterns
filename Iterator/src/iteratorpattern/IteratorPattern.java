package iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class IteratorPattern {

    static List<Ders> bilgMuhDersEkle() {
        List<Ders> bmd = new ArrayList<>();
        bmd.add(new Ders("BLM01", "Bilgisayar Muh Giris", 102));
        bmd.add(new Ders("BLM05", "Programlama 1", 105));
        bmd.add(new Ders("BLM16", "Nesneye Yonelik Programlama", 86));
        bmd.add(new Ders("BLM35", "Yapay Zeka", 22));
        bmd.add(new Ders("BLM41", "YazLab", 108));
        return bmd;
    }

    static List<Ders> insaatMuhDersEkle() {
        List<Ders> imd = new ArrayList<>();
        imd.add(new Ders("INS71", "Insaat Müh Giris ", 120));
        imd.add(new Ders("INS81", "Akiskanlar Mekanigi", 85));
        imd.add(new Ders("INS91", "Mukavemet 1", 103));
        return imd;
    }

    public static void main(String[] args) throws InterruptedException {
        DersAggregate da;
        List<Ders> bilgMuhDersler = bilgMuhDersEkle();
        List<Ders> insaatMuhDersler = insaatMuhDersEkle();
        
        da = new DersAggregate(bilgMuhDersler);
        Iterator iterator = da.getIterator();
        IteratorThread t = new IteratorThread(iterator);
        t.start();
        t.join();
        
        da = new DersAggregate(insaatMuhDersler);
        iterator = da.getIterator();
        t = new IteratorThread(iterator);
        t.start();
        t.join();
    }

}
