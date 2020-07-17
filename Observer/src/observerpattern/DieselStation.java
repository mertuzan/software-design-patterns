package observerpattern;

import java.util.ArrayList;
import java.util.List;

class DieselStation implements Subject {

    private List<Observer> observerList;
    private double price;
    private double oldPrice;

    DieselStation(double price) {
        observerList = new ArrayList<>();
        this.price = price;
        
    }

    public void setPrice(double price) {
        oldPrice=this.price;
        this.price = price;
        doNotify();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void doNotify() {
        for (Observer observer : observerList) {
            if(observer.getClass()==DieselCustomer1.class && Math.abs(price-oldPrice)<=0.25){
                    observer.update(price);
            }
            if(observer.getClass()==DieselCustomer2.class && Math.abs(price-oldPrice)<=1){
                    observer.update(price);
            }
                
        }
    }

}
