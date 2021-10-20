package Tarea10.Productos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> productRepo = new HashMap<>();
    static {
        Product item1 = new Product();
        item1.setIdProduct(1);
        item1.setProductName("Croquetas");
        item1.setProductDescription("Croquetas finas siuuuuuu");
        item1.setProductPrice(1600);
        item1.setUrlImage("aqui va una imagen");
        item1.setForCat(false);
        item1.setForDog(true);
        item1.setProductQty(10);

        productRepo.put(item1.getIdProduct(), item1);

        Product item2 = new Product();
        item2.setIdProduct(2);
        item2.setProductName("Croquetas Miau");
        item2.setProductDescription("Croquetas finas de michis");
        item2.setProductPrice(1200);
        item2.setUrlImage("aqui va una imagen");
        item2.setForCat(true);
        item2.setForDog(false);
        item2.setProductQty(10);

        productRepo.put(item2.getIdProduct(), item2);


    }
    @Override
    public void createProduct(Product product) {
        productRepo.put(product.getIdProduct(), product);
    }
    @Override
    public void updateProduct(int id, Product product) {
        productRepo.remove(id);
        product.setIdProduct(id);
        productRepo.put(id, product);
    }
    @Override
    public void deleteProduct(int id) {
        productRepo.remove(id);

    }
    @Override
    public Collection<Product> getProducts() {
        return productRepo.values();
    }
}
