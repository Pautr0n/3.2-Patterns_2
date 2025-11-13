package level2.observer;

import level2.publisher.Broker;

public class StockAgency implements StockObserver {
    private final String name;


    public StockAgency(String name){
        this.name = name;
    }

    @Override
    public void update(String stockMovement) {
        System.out.println(name + " received notification: " + stockMovement);
    }
}
