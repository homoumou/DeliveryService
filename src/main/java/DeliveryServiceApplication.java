import constant.OfferCode;
import entities.Coupon;
import entities.Delivery;
import service.DeliveryCostCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DeliveryServiceApplication {
    public static void main(String[] args) {
        DeliveryCostCalculator deliveryCostCalculator = new DeliveryCostCalculator();
        Delivery delivery1 = new Delivery(5, 5);
        Delivery delivery2 = new Delivery(15, 5);
        Delivery delivery3 = new Delivery(10, 100);

        Map<Delivery, OfferCode> arrayMap = new HashMap<>();
        arrayMap.put(delivery1, OfferCode.OFR001);
        arrayMap.put(delivery2, OfferCode.OFR002);
        arrayMap.put(delivery3, OfferCode.OFR003);

        Iterator iterator = arrayMap.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<Delivery, OfferCode> entry = (Map.Entry<Delivery, OfferCode>) iterator.next();
            deliveryCostCalculator.calculateDeliveryCost(entry.getKey(), entry.getValue());
        }
    }
}
