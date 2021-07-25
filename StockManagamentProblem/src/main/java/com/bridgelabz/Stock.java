package com.bridgelabz;

import java.util.List;

public class Stock {
    private String name;
    private List<Share> sharesList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Share> getSharesList() {
        return sharesList;
    }

    public void setSharesList(List<Share> sharesList) {
        this.sharesList = sharesList;
    }

    @Override
    public String toString() {
        return "Stock [name=" + name + ", sharesList=" + sharesList + "]";
    }
}
