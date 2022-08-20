package entities;

public class Delivery {
    private int weight;
    private int distances;
    private int deliveryCost;

    public Delivery() {
    }

    public Delivery(int weight, int distances) {
        this.weight = weight;
        this.distances = distances;
        this.deliveryCost = 100 + (weight * 10) + (distances * 5);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDistances() {
        return distances;
    }

    public void setDistances(int distances) {
        this.distances = distances;
    }

    public int getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(int deliveryCost) {
        this.deliveryCost = deliveryCost;
    }



}
