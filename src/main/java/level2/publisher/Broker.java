package level2.publisher;

import level2.observer.StockAgency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Broker implements StockAlertListener {
    private List<StockAgency> stockAgencies = new ArrayList<>();
    private String stockMovement;

    public void setStockMovement(String stockMovement) {
        this.stockMovement = stockMovement;
        notifyStockAgencies();
    }

    @Override
    public void subscribeNotifications(StockAgency... stockAgency) {
        stockAgencies.addAll(Arrays.asList(stockAgency));
    }


    @Override
    public void unSubscribeNotifications(StockAgency... stockAgency) {
        stockAgencies.addAll(Arrays.asList(stockAgency));
    }

    @Override
    public void notifyStockAgencies() {
        for (StockAgency stockAgency : stockAgencies) {
            stockAgency.update(stockMovement);
        }
    }
}
