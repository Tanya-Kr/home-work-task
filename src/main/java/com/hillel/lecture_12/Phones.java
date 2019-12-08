package com.hillel.lecture_12;

public enum Phones {

    IPHONE("11 Pro", "Apple"),
    SAMSUNG("Galaxy S10", "Samsung"),
    XIAOMI("RedMe Note 10", "Xiomi"),
    OPPO("K3", "Oppo");

    private String model;
    private String produser;

    Phones(String model, String produser) {
        this.model = model;
        this.produser = produser;

    }

    public String getModel() {
        return model;
    }

    public String getProduser() {
        return produser;
    }
}
