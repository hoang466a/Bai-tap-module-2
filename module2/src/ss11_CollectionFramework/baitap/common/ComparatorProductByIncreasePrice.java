package ss11_CollectionFramework.baitap.common;
import ss11_CollectionFramework.baitap.model.Product;

import java.util.Comparator;

public class ComparatorProductByIncreasePrice implements Comparator<Product> {
    public int compare(Product o1,Product o2)
    {
        return o1.getProductprice()>o2.getProductprice()?1:-1;
    }

}
