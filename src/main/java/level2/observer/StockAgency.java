package level2.observer;

import level2.publisher.Broker;

public class StockAgency implements StockObserver {
    private String name;
    private Broker broker;

    public StockAgency(Broker broker, String name){
        this.name = name;
        this.broker = broker;
    }

    @Override
    public void update(String stockMovement) {
        System.out.println(name + " received notification: " + stockMovement);
    }
}
