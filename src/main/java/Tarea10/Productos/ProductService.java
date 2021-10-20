package Tarea10.Productos;

import java.util.Collection;

public interface ProductService {
    public abstract void createProduct(Product product);
    public abstract void updateProduct(int id, Product product);
    public abstract void deleteProduct(int id);
    public abstract Collection<Product> getProducts();
}