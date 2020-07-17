package iteratorpattern;

class IteratorThread extends Thread {

    private Iterator iterator;

    IteratorThread(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public void run() {
        printDersler();
    }

    void printDersler() {
        System.out.println("|KOD| : |DERS ADI| : |OGRENCI SAYISI|");
        for (iterator.first(); !iterator.isDone(); iterator.next()) {
            Ders ders = iterator.currentItem();
            System.out.println(ders.getKod() + " : " + ders.getAd() + " : " + ders.getOgrSayisi());
        }
        System.out.println();
    }
}
