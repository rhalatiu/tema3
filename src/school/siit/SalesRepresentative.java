package school.siit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SalesRepresentative {
    private int numberOfSales;
    private int quota;
    private int worthOfSales;

    public SalesRepresentative() {
    }

    public SalesRepresentative(int numberOfSales, int quota) {
        this.numberOfSales = numberOfSales;
        this.quota = quota;
        this.worthOfSales = numberOfSales * quota;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public int getWorthOfSales() {
        return worthOfSales;
    }

    public void setWorthOfSales(int worthOfSales) {
        this.worthOfSales = worthOfSales;
    }
}