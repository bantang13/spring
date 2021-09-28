package com.pctc.service;

/**
 * @author H1PPPY
 * @date 2021/9/28 10:32
 */
public class Worker {
    private ProductionTool productionTool;
    private Transportation transportation;

    public Worker(ProductionTool productionTool, Transportation transportation) {
        this.productionTool = productionTool;
        this.transportation = transportation;
    }

    public Worker() {
    }

    public ProductionTool getProductionTool() {
        return productionTool;
    }

    public void setProductionTool(ProductionTool productionTool) {
        this.productionTool = productionTool;
    }

    public Transportation getTransportation() {
        return transportation;
    }

    public void setTransportation(Transportation transportation) {
        this.transportation = transportation;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "productionTool=" + productionTool +
                ", transportation=" + transportation +
                '}';
    }
}
