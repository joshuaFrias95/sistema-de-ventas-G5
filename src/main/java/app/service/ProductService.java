package app.service;

import app.dto.ProductDTO;
import app.model.ECategory;
import app.model.Product;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marco
 */
public class ProductService implements CrudService{

    @Override
    public Object create(Object object) {
        ProductDTO product = (ProductDTO) object;
        return new Product(
                product.name(), 
                product.category(), 
                product.amount());}
}
