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
public class ScoreModify {
    public static List<Score> findScoreAll() {
        List<Score> ScoreList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select sv.MSSV,  d.mamon, d.kq from sinhvien sv join diem d ON d.MSSV=sv.MSSV join mon m ON m.mamon=d.mamon";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                Score p = new Score( 
                        resultSet.getString("MSSV"),
                        resultSet.getString("mamon"),
                        resultSet.getFloat("kq"));
                ScoreList.add(p);
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
        
        return ScoreList;
    }
    public static void insertScore(Score p) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "insert into diem(MSSV, mamon, kq) values(?, ?, ?)";
            statement = connection.prepareCall(sql);
           
            statement.setString(1, p.getMSSV());
            statement.setString(2, p.getMaMon());
            statement.setFloat(3, p.getKQ());
            
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
    
    public static void deleteScore(String score) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "delete from diem where mssv = ?";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, score);
            
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
    
    public static List<Score> findByMSSVScore(String mssv) {
        List<Score> scoreList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select * from diem where MSSV like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+mssv+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Score std = new Score(
                        resultSet.getString("MSSV"),
                        resultSet.getString("mamon"),
                        resultSet.getFloat("kq"));
                scoreList.add(std);
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
        
        return scoreList;
    }
    
    public static void updateScore(Score score) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
//            String sql = "UPDATE sinhvien SET MSSV=?,ten=?,gioitinh=?,namsinh=?,diachi=?, email=?, SDT=?, lop=?,nganh=?,khoa=?,ghichu=? WHERE MSSV = ?";
            String sql = "UPDATE diem SET MSSV = ?, mamon = ?, kq = ? WHERE mamon = ? and mssv = ? ";
            statement = connection.prepareCall(sql);
            statement.setString(1, score.getMSSV());
            statement.setString(2, score.getMaMon());
            statement.setFloat(3, score.getKQ());
            statement.setString(4, score.getMaMon());
            statement.setString(5, score.getMSSV());
            
            
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

}
