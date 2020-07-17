package observerpattern;

import java.text.DecimalFormat;

class DieselCustomer1 implements Observer {

    @Override
    public void update(double price) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println("customer type 1: " + df.format(price));
    }

}
