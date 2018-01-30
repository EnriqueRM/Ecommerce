/**
 * 
 */
package com.basico.service;

/**
 * @author Curson ma�ana
 *
 */
import java.io.Serializable;
import java.util.List;

import com.basico.domain.Product;

public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
    
}

