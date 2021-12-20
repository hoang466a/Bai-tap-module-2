package ss11_CollectionFramework.baitap.common;
import ss11_CollectionFramework.baitap.model.Product;

import java.util.Comparator;
public class ComparatorProductByDecreasePrice implements Comparator<Product> {
    public int compare(Product o1,Product o2){
        return o2.getProductprice()>o1.getProductprice()?1:-1;
    }


}
