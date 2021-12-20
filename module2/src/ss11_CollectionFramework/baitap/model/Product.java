package ss11_CollectionFramework.baitap.model;

public class Product {

    private String productname;
    private String productid;
    private int productprice;



    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public int getProductprice() {
        return productprice;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productid='" + productid + '\'' +
                ", productname='" + productname + '\'' +
                ", productprice='" + productprice + '\'' +
                '}';
    }



    public Product(){};
    public Product(String productid,String productname,int productprice){
        this.productid=productid;
        this.productname=productname;
        this.productprice=productprice;
    };
}
