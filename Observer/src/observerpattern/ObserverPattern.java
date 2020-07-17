package observerpattern;

public class ObserverPattern {

    public static void main(String[] args) {
        DieselStation dieselStation = new DieselStation(22.0);
        DieselCustomer1 dc1 = new DieselCustomer1();
        DieselCustomer2 dc2 = new DieselCustomer2();
        DieselCustomer1 dc3 = new DieselCustomer1();

        dieselStation.addObserver(dc1);
        dieselStation.addObserver(dc2);
        dieselStation.addObserver(dc3);

        priceThread pt=new priceThread(dieselStation);
        pt.start();

    }

}
