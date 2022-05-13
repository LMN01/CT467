/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanct467;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MN
 */
public class SubjectScoreModify {
    public static List<SubjectScore> findSubjectScoreAll() {
        List<SubjectScore> SubjectScoreList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select sv.MSSV, sv.ten, m.mamon,  m.tenmh, m.stc, d.kq from sinhvien sv join diem d ON d.MSSV=sv.MSSV join mon m ON m.mamon=d.mamon order by MSSV";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                SubjectScore sb = new SubjectScore( 
                        resultSet.getString("MSSV"),
                        resultSet.getString("ten"),
                        resultSet.getString("mamon"),
                        resultSet.getString("tenmh"),
                        resultSet.getInt("stc"),
                        resultSet.getFloat("kq"));
                SubjectScoreList.add(sb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return SubjectScoreList;
    }
    public static List<SubjectScore> findByMSSV(String mssv) {
        List<SubjectScore> SubjectScoreList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select sv.MSSV, sv.ten, m.mamon,  m.tenmh, m.stc, d.kq from sinhvien sv join diem d ON d.MSSV=sv.MSSV join mon m ON m.mamon=d.mamon where sv.MSSV like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+mssv+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                SubjectScore sb = new SubjectScore( 
                        resultSet.getString("ten"),
                        resultSet.getString("MSSV"),
                        resultSet.getString("mamon"),
                        resultSet.getString("tenmh"),
                        resultSet.getInt("stc"),
                        resultSet.getFloat("kq"));
                SubjectScoreList.add(sb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
        
        return SubjectScoreList;
    }
    public static void delete(String mssv, String mamon) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "delete from diem where mssv = ? and mamon = ? ";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, mssv);
            statement.setString(2, mamon);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }
//    public static void insertSubject(Subject sb) {
//        Connection connection = null;
//        PreparedStatement statement = null;
//        
//        try {
//            //lay tat ca danh sach sinh vien
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
//            
//            //query
//            String sql = "insert into mon(mamon, tenmh, stc) values(?, ?, ?)";
//            statement = connection.prepareCall(sql);
//            statement.setString(1, sb.getMaMon());
//            statement.setString(2, sb.getTenMH());
//            statement.setFloat(3, sb.getSTC());
//            statement.execute();
//        } catch (SQLException ex) {
//            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if(statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//            
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
//        //ket thuc.
//    }
}
