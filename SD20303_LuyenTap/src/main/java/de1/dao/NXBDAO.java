/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1.dao;

import de1.entity.NXB;
import de1.util.XQuery;
import java.util.List;

/**
 *
 * @author Huyen
 */
public class NXBDAO {
   String getAllSql ="""
                     SELECT TOP (1000) [id]
                           ,[ma]
                           ,[ten]
                       FROM [DB_DAM_Sach_NXB].[dbo].[nxb]
                     """;
   String findByIDSql = """
                     SELECT TOP (1000) [id]
                           ,[ma]
                           ,[ten]
                       FROM [DB_DAM_Sach_NXB].[dbo].[nxb]
                     WHERE id =?
                     """;
   public List<NXB> getAll(){
       return XQuery.getBeanList(NXB.class, getAllSql);
   }
   public NXB findByID(int id){
       return XQuery.getSingleBean(NXB.class, findByIDSql, id);
   }
}
