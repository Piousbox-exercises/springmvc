/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springmvc.repository;

import java.util.List;

import springmvc.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);
}
