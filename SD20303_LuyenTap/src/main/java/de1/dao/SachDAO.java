/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1.dao;

import de1.entity.Sach;
import de1.util.XJdbc;
import de1.util.XQuery;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huyen
 */
public class SachDAO {
    String getAllSql= """
                    SELECT TOP (1000) [id]
                          ,[ma]
                          ,[ten]
                          ,[soTrang]
                          ,[donGia]
                          ,[idNxb]
                          ,[trangThai]
                      FROM [DB_DAM_Sach_NXB].[dbo].[sach]
                    """;
    String insertSql ="""
                      INSERT INTO [dbo].[sach]
                                 ([ma],[ten],[soTrang],[donGia],[idNxb] ,[trangThai])
                           VALUES
                                 (?,?,?,?,?,?)
                      """;
    public List<Sach> getAll(){
        return XQuery.getBeanList(Sach.class, getAllSql);
    }
    //tạo mới
    public int create(Sach sach){
        //XJdbc hay XQuery??
        //XJdbc => executeUpdate hay excuteQuery?
        //executeUpdate
        Object[] values = {
            sach.getMa(),
            sach.getTen(),
            sach.getSoTrang(),
            sach.getDonGia(),
            sach.getIdNXB(),
            sach.getTrangThai()
        };
        return XJdbc.executeUpdate(insertSql, values);
    }
    //update
    //delete
    public static void main(String[] args) {
        SachDAO dao = new SachDAO();
        List<Sach> lstSachs= dao.getAll();
        for (Sach s : lstSachs) {
            System.out.println(s.toString());
        }
        //về nhà test-> Builder??
        Sach sach= new Sach(1, "S006", "Sach Lap Trinh",
                360, 250000, 1, 1);
        int ketQua = dao.create(sach);
        System.out.println("So ban ghi thuc hien: "+ ketQua);
    }
}
