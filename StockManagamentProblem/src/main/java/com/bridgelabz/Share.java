package com.bridgelabz;

public class Share {
    private String name;
    private long noOfShare;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNoOfShare() {
        return noOfShare;
    }

    public void setNoOfShare(long noOfShare) {
        this.noOfShare = noOfShare;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Share [name=" + name + ", noOfShare=" + noOfShare + ", price=" + price + "]";
    }

}
