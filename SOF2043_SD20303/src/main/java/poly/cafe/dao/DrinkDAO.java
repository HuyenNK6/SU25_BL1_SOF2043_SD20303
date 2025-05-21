/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.cafe.dao;

import java.util.List;
import poly.cafe.entity.Drink;

/**
 *
 * @author Huyen
 */
public interface DrinkDAO extends CrudDAO<Drink, String>{
    //tìm kiếm đồ uống theo id của danh mục Category
    List<Drink> findByCategoryId(String categoryId);
}
