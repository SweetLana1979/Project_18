package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ShopRepositoryTest {
    @Test
    public void testRemoveWithProductExisted() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(13, "кабачки", 150);
        Product product2 = new Product(22, "баклажаны", 300);
        Product product3 = new Product(515, "помидоры", 200);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(22);
        Product[] actual = repo.findAll();
        Product[] expected = {product1, product3};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testRemoveWithProductNotExisted() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(13, "кабачки", 150);
        Product product2 = new Product(22, "баклажаны", 300);
        Product product3 = new Product(515, "помидоры", 200);


        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        Assertions.assertThrows(NotFoundException.class,
                () -> repo.remove(1234)
                );
    }



    }














