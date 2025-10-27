package Marker_Interfaces.Cloning_Prototype_Objects;

public class ProductImpl implements Cloneable{
    int productId;
    String productName;

    ProductImpl(int id, String name) {
        this.productId = id;
        this.productName = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
