package config;

import constant.OfferCode;
import entities.Coupon;

import java.util.HashMap;
import java.util.Map;

public class CouponTable {
    public Map<OfferCode, Coupon> couponTable = new HashMap<>();

    public CouponTable() {
        Map<OfferCode, Coupon> couponTable = new HashMap<>();
        couponTable.put(OfferCode.OFR001, new Coupon(0, 200, 70, 200, 0.1));
        couponTable.put(OfferCode.OFR002, new Coupon(50, 150, 100, 250, 0.07));
        couponTable.put(OfferCode.OFR003, new Coupon(50, 250, 10, 150, 0.05));
        this.couponTable = couponTable;
    }

    public Coupon getCoupon(OfferCode offerCode) {
        return couponTable.get(offerCode);
    }
}
