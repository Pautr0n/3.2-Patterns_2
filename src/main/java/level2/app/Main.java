package level2.app;

import level2.observer.StockAgency;
import level2.publisher.Broker;

public class Main {

    public static void main(String[] args) {

        Broker broker = new Broker();
        StockAgency agency1 = new StockAgency(broker, "We Make You Poor Agency");
        StockAgency agency2 = new StockAgency(broker, "We Get Rich You Don'tAgency");
        StockAgency agency3 = new StockAgency(broker, "We Steal your Savings Agency");
        StockAgency agency4 = new StockAgency(broker, "The Poverty Makers Agency");

        broker.subscribeNotifications(agency1, agency2, agency3, agency4);

        broker.setStockMovement("The index increased by two points.");
        System.out.println("-----------------------------------------------------------");
        broker.setStockMovement("The index decreased by half a point.");
        System.out.println("-----------------------------------------------------------");
        broker.unSubscribeNotifications(agency1);

        broker.setStockMovement("The index cracked, we've lost everything.");

    }
}
