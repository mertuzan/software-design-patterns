package observerpattern;

import java.text.DecimalFormat;

class priceThread extends Thread {

    private DieselStation dieselStation;

    priceThread(DieselStation dieselStation) {
        this.dieselStation = dieselStation;
    }

    @Override
    public void run() {
        double price = 6.00;
        double rand;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        for (int i = 0; i < 20; i++) {
            rand = ((Math.random() * 10) - 5) % 1;
            price = price + rand;
            System.out.println("\nNEW DIESEL PRICE:" + df.format(price));
            dieselStation.setPrice(price);

        }
    }
}
