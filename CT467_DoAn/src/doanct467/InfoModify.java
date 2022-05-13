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
public class InfoModify {
    public static List<Info> findInfoAll() {
        List<Info> InfoList = new ArrayList<>();
        
        Connection connection = null;
        Statement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "SELECT sv.mssv, sv.ten, sv.gioitinh, sv.namsinh, sv.diachi, sv.nganh, sv.lop, sv.khoa, avg(kq) as dtb FROM sinhvien sv join diem d on sv.MSSV = d.MSSV GROUP BY sv.MSSV";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                Info info = new Info( 
                        resultSet.getString("MSSV"),
                        resultSet.getString("ten"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("namsinh"),
                        resultSet.getString("diachi"),
                        resultSet.getString("nganh"),
                        resultSet.getString("lop"),
                        resultSet.getString("khoa"),
                        resultSet.getString("dtb"));
                InfoList.add(info);
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
        
        return InfoList;
    }
    public static List<Info> findByMSSV(String mssv) {
        List<Info> InfoList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select MSSV, ten, gioitinh, namsinh, diachi, nganh,  lop, khoa, diachi from sinhvien order by MSSV where MSSV like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+mssv+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Info sb = new Info( 
                        resultSet.getString("MSSV"),
                        resultSet.getString("ten"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("namsinh"),
                        resultSet.getString("diachi"),
                        resultSet.getString("nganh"),
                        resultSet.getString("lop"),
                        resultSet.getString("khoa"),
                        resultSet.getString("dtb"));
                InfoList.add(sb);
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
        
        return InfoList;
    }
        public static List<Info> findByGT(String gioitinh) {
        List<Info> InfoList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select MSSV, ten, gioitinh, namsinh, diachi, nganh,  lop, khoa from sinhvien where gioitinh like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+gioitinh+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Info sb = new Info( 
                        resultSet.getString("MSSV"),
                        resultSet.getString("ten"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("namsinh"),
                        resultSet.getString("diachi"),
                        resultSet.getString("nganh"),
                        resultSet.getString("lop"),
                        resultSet.getString("khoa"));
                InfoList.add(sb);
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
        
        return InfoList;
    }
    public static List<Info> findByNamsinh(String namsinh) {
        List<Info> InfoList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select MSSV, ten, gioitinh, namsinh, diachi, nganh,  lop, khoa from sinhvien where namsinh like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+namsinh+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Info sb = new Info( 
                        resultSet.getString("MSSV"),
                        resultSet.getString("ten"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("namsinh"),
                        resultSet.getString("diachi"),
                        resultSet.getString("nganh"),
                        resultSet.getString("lop"),
                        resultSet.getString("khoa"));
//                        resultSet.getString("dtb"));
                InfoList.add(sb);
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
        
        return InfoList;
    }
    public static List<Info> findByDiachi(String diachi) {
        List<Info> InfoList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select MSSV, ten, gioitinh, namsinh, diachi, nganh,  lop, khoa from sinhvien where diachi like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+diachi+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Info sb = new Info( 
                        resultSet.getString("MSSV"),
                        resultSet.getString("ten"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("namsinh"),
                        resultSet.getString("diachi"),
                        resultSet.getString("nganh"),
                        resultSet.getString("lop"),
                        resultSet.getString("khoa"));
                InfoList.add(sb);
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
        
        return InfoList;
    }
    public static List<Info> findByNganh(String nganh) {
        List<Info> InfoList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select MSSV, ten, gioitinh, namsinh, diachi, nganh,  lop, khoa from sinhvien where nganh like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+nganh+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Info sb = new Info( 
                        resultSet.getString("MSSV"),
                        resultSet.getString("ten"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("namsinh"),
                        resultSet.getString("diachi"),
                        resultSet.getString("nganh"),
                        resultSet.getString("lop"),
                        resultSet.getString("khoa"));
                InfoList.add(sb);
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
        
        return InfoList;
    }
    public static List<Info> findByLop(String lop) {
        List<Info> InfoList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select MSSV, ten, gioitinh, namsinh, diachi, nganh,  lop, khoa from sinhvien where lop like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+lop+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Info sb = new Info( 
                        resultSet.getString("MSSV"),
                        resultSet.getString("ten"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("namsinh"),
                        resultSet.getString("diachi"),
                        resultSet.getString("nganh"),
                        resultSet.getString("lop"),
                        resultSet.getString("khoa"));
                InfoList.add(sb);
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
        
        return InfoList;
    }
    public static List<Info> findByKhoa(String khoa) {
        List<Info> InfoList = new ArrayList<>();
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select MSSV, ten, gioitinh, namsinh, diachi, nganh,  lop, khoa from sinhvien where khoa like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+khoa+"%");
            
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {                
                Info sb = new Info( 
                        resultSet.getString("MSSV"),
                        resultSet.getString("ten"),
                        resultSet.getString("gioitinh"),
                        resultSet.getString("namsinh"),
                        resultSet.getString("diachi"),
                        resultSet.getString("nganh"),
                        resultSet.getString("lop"),
                        resultSet.getString("khoa"));
                InfoList.add(sb);
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
        
        return InfoList;
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
    public static float tinhtb(String mssv) {
        Connection connection = null;
        PreparedStatement statement = null;
        float dtb = 0;
        float tc = 0;
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select d.kq, m.stc from diem d join mon m on d.mamon = m.mamon  WHERE mssv = ? ";
            statement = connection.prepareCall(sql);
            statement.setString(1, mssv);
            ResultSet rs = statement.executeQuery();
 
            while (rs.next()){
                dtb = dtb+(Float.parseFloat(rs.getString("kq")) * Float.parseFloat(rs.getString("stc")));
                tc = tc + Float.parseFloat(rs.getString("stc"));
                
            }
            dtb = dtb/tc;
//            statement.execute();
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
    return dtb;    
    }

    
    public static String showSum() {
        
        Connection connection = null;
        Statement statement = null;
        
        String sumStudent = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "select count(MSSV) from sinhvien";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                sumStudent = resultSet.getString("count(MSSV)");
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
        
        return sumStudent;
    }
    
    public static String sumMale() {

        Connection connection = null;
        Statement statement = null;
        
        String sumMale = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "SELECT COUNT(MSSV) from sinhvien WHERE gioitinh LIKE 'nam'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                sumMale = resultSet.getString("count(MSSV)");
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
        
        return sumMale;
    }
    
    public static String sumFemale() {

        Connection connection = null;
        Statement statement = null;
        
        String sumFemale = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "SELECT COUNT(MSSV) from sinhvien WHERE gioitinh LIKE 'nu'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                sumFemale = resultSet.getString("count(MSSV)");
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
        
        return sumFemale;
    }
    
    public static String sumXuatSac() {
        
        Connection connection = null;
        Statement statement = null;
        
        String sum = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "SELECT COUNT(dtb) from sinhvien sv join (SELECT sv.mssv, sv.ten, sv.gioitinh, sv.namsinh, sv.diachi, sv.nganh, sv.lop, sv.khoa, avg(kq) as dtb FROM sinhvien sv join diem d on sv.MSSV = d.MSSV GROUP BY sv.MSSV) a on a.MSSV = sv.MSSV WHERE a.dtb >= 9";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                sum = resultSet.getString("COUNT(dtb)");
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
        
        return sum;
    }
    
    public static String sumGioi() {
        
        Connection connection = null;
        Statement statement = null;
        
        String sum = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "SELECT COUNT(dtb) from sinhvien sv join (SELECT sv.mssv, sv.ten, sv.gioitinh, sv.namsinh, sv.diachi, sv.nganh, sv.lop, sv.khoa, avg(kq) as dtb FROM sinhvien sv join diem d on sv.MSSV = d.MSSV GROUP BY sv.MSSV) a on a.MSSV = sv.MSSV WHERE a.dtb >= 8 and a.dtb <9";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                sum = resultSet.getString("COUNT(dtb)");
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
        
        return sum;
    }
    
    public static String sumKha() {
        
        Connection connection = null;
        Statement statement = null;
        
        String sum = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "SELECT COUNT(dtb) from sinhvien sv join (SELECT sv.mssv, sv.ten, sv.gioitinh, sv.namsinh, sv.diachi, sv.nganh, sv.lop, sv.khoa, avg(kq) as dtb FROM sinhvien sv join diem d on sv.MSSV = d.MSSV GROUP BY sv.MSSV) a on a.MSSV = sv.MSSV WHERE a.dtb >= 7 and a.dtb <8";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                sum = resultSet.getString("COUNT(dtb)");
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
        
        return sum;
    }
    
    public static String sumTrungBinh() {
        
        Connection connection = null;
        Statement statement = null;
        
        String sum = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "SELECT COUNT(dtb) from sinhvien sv join (SELECT sv.mssv, sv.ten, sv.gioitinh, sv.namsinh, sv.diachi, sv.nganh, sv.lop, sv.khoa, avg(kq) as dtb FROM sinhvien sv join diem d on sv.MSSV = d.MSSV GROUP BY sv.MSSV) a on a.MSSV = sv.MSSV WHERE a.dtb >= 6 and a.dtb <7";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                sum = resultSet.getString("COUNT(dtb)");
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
        
        return sum;
    }
    
    public static String sumCanhBao() {
        
        Connection connection = null;
        Statement statement = null;
        
        String sum = null;
        
        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ct467", "root", "");
            
            //query
            String sql = "SELECT COUNT(dtb) from sinhvien sv join (SELECT sv.mssv, sv.ten, sv.gioitinh, sv.namsinh, sv.diachi, sv.nganh, sv.lop, sv.khoa, avg(kq) as dtb FROM sinhvien sv join diem d on sv.MSSV = d.MSSV GROUP BY sv.MSSV) a on a.MSSV = sv.MSSV WHERE a.dtb <5";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                sum = resultSet.getString("COUNT(dtb)");
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
        
        return sum;
    }
    
    
}
