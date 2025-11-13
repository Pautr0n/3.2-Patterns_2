package level2.publisher;

import level2.observer.StockAgency;

public interface StockAlertListener {
    void subscribeNotifications(StockAgency... stockAgency);
    void unSubscribeNotifications(StockAgency... stockAgency);
    void notifyStockAgencies();
}
