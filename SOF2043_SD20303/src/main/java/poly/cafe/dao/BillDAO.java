/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.cafe.dao;

import java.util.List;
import poly.cafe.entity.Bill;

/**
 *
 * @author Huyen
 */
public interface BillDAO extends CrudDAO<Bill, Long> {
//tìm kiếm Hóa đơn Bill theo Username (ng đăng nhập vào)
    List<Bill> findByUsername(String username);

    List<Bill> findByCardId(Integer cardId);
}
