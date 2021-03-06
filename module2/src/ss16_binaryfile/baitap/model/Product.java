package ss16_binaryfile.baitap.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String product_id;
    private String product_name;
    private String product_brand;
    private int product_price;

    public Product(){};


    public Product(String product_id, String product_name, String product_brand, int product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_brand = product_brand;
        this.product_price = product_price;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public void setProduct_brand(String product_brand) {
        this.product_brand = product_brand;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_brand='" + product_brand + '\'' +
                ", product_price=" + product_price +
                '}';
    }
}
