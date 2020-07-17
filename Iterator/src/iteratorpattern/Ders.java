package iteratorpattern;

public class Ders {

    private final String kod;
    private final String ad;
    private final int ogrSayisi;

    public Ders(String kod, String ad, int sayi) {
        this.kod = kod;
        this.ad = ad;
        this.ogrSayisi = sayi;

    }

    public String getKod() {
        return kod;
    }

    public String getAd() {
        return ad;
    }

    public int getOgrSayisi() {
        return ogrSayisi;
    }

}
