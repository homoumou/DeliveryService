package service;

import config.CouponTable;
import constant.OfferCode;
import entities.Coupon;
import entities.Delivery;

public class DeliveryCostCalculator {

    public double calculateDeliveryCost(Delivery delivery, OfferCode offerCode) {
        CouponTable couponTable = new CouponTable();
        Coupon coupon = couponTable.getCoupon(offerCode);

        if(rangeInDefined(delivery.getDistances(), coupon.getMinDistance(), coupon.getMaxDistance())
        && rangeInDefined(delivery.getWeight(), coupon.getMinWeight(), coupon.getMaxWeight())){
            System.out.println("Delivery Cost: " + delivery.getDeliveryCost() +
                    " Discount cost: " + delivery.getDeliveryCost() * coupon.getDiscount() +
                    " Final cost: " + (delivery.getDeliveryCost() - delivery.getDeliveryCost() * coupon.getDiscount()));
            return delivery.getDeliveryCost() - delivery.getDeliveryCost() * coupon.getDiscount();
        }
        System.out.println("Delivery Cost: " + delivery.getDeliveryCost() +
                " Discount cost: " + 0 +
                " Final cost: " + (delivery.getDeliveryCost()));
        return delivery.getDeliveryCost();
    }

    public static boolean rangeInDefined(int current, int min, int max) {
        return Math.max(min, current) == Math.min(current, max);
    }
}


