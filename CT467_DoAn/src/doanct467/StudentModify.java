/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doanct467;

/**
 *
 * @author User
 */
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
 * CRUD (insert, update, delete, findAll)
 * @author Diep.Tran
 */
public class StudentModify {
    public static List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select * from sinhvien";
            statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {                
                Student std = new Student( 
                        resultSet.getString("mssv"),
                        resultSet.getString("ten"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("namsinh"),
                        resultSet.getString("diachi"),
                        resultSet.getString("email"),
                        resultSet.getString("SDT"),
                        resultSet.getString("lop"),
                        resultSet.getString("nganh"),
                        resultSet.getString("khoa"),
                        resultSet.getString("ghichu"));
                studentList.add(std);
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
        
        return studentList;
    }
    
    public static void insert(Student std) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "insert into sinhvien(mssv, ten, gioitinh, namsinh, diachi, email, sdt, lop, nganh, khoa, ghichu) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, std.getMssv());
            statement.setString(2, std.getTen());
            statement.setString(3, std.getGioitinh());
            statement.setString(4, std.getNamsinh());
            statement.setString(5, std.getDiachi());
            statement.setString(6, std.getEmail());
            statement.setString(7, std.getSdt());
            statement.setString(8, std.getLop());
            statement.setString(9, std.getNganh());
            statement.setString(10, std.getKhoa());
            statement.setString(11, std.getGhichu());
            
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
    
    public static void update(Student std) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "UPDATE sinhvien SET MSSV=?,ten=?,gioitinh=?,namsinh=?,diachi=?, email=?, SDT=?, lop=?,nganh=?,khoa=?,ghichu=? WHERE MSSV = ?";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, std.getMssv());
            statement.setString(2, std.getTen());
            statement.setString(3, std.getGioitinh());
            statement.setString(4, std.getNamsinh());
            statement.setString(5, std.getDiachi());
            statement.setString(6, std.getEmail());
            statement.setString(7, std.getSdt());
            statement.setString(8 ,std.getLop());
            statement.setString(9, std.getNganh());
            statement.setString(10, std.getKhoa());
            statement.setString(11, std.getGhichu());
            statement.setString(12, std.getMssv());
            
            
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
    
    public static void delete(String mssv) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "delete from sinhvien where mssv = ? ";
            statement = connection.prepareCall(sql);
            
            statement.setString(1, mssv);
            
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
    

    /**
     *
     * @param mssv
     * @return
     */
    public static List<Student> findByMSSV(String mssv) {
        List<Student> studentList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select * from sinhvien where MSSV like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+mssv+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Student std = new Student( 
                        resultSet.getString("MSSV"),
                        resultSet.getString("ten"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("namsinh"),
                        resultSet.getString("diachi"),
                        resultSet.getString("email"),
                        resultSet.getString("SDT"),
                        resultSet.getString("lop"),
                        resultSet.getString("nganh"),
                        resultSet.getString("khoa"),
                        resultSet.getString("ghichu"));
                studentList.add(std);
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
        
        return studentList;
    }

    public static void main(String []args){
        List<Student> list = new ArrayList<>();
        list.forEach((sinhvien) -> {
            System.out.println(sinhvien.toString());
            
        });
        
        
        
    };
}
