package Tarea10.Productos;

public class Product {
    private int idProduct;
    private String productName;
    private String productDescription;
    private double productPrice;
    private String urlImage;
    private boolean forDog;
    private boolean forCat;
    private int productQty;

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public boolean isForDog() {
        return forDog;
    }

    public void setForDog(boolean forDog) {
        this.forDog = forDog;
    }

    public boolean isForCat() {
        return forCat;
    }

    public void setForCat(boolean forCat) {
        this.forCat = forCat;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }
}