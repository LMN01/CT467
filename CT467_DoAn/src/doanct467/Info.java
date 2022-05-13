/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package doanct467;

/**
 *
 * @author User
 */
public class Info {
    private String MSSV;
    private String ten;
    private String gioitinh;
    private String namsinh;   
    private String diachi;
    private String nganh;
    private String lop;
    private String khoa;
    private String dtb;
    public Info() {
    }
    public Info(String MSSV, String ten, String gioitinh, String namsinh, String diachi, String nganh, String lop,  String khoa, String dtb) {
        this.MSSV = MSSV;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
        this.diachi = diachi;
        this.nganh = nganh;
        this.lop = lop;
        this.khoa = khoa;
        this.dtb = dtb;
    }
    
    public Info(String MSSV, String ten, String gioitinh, String namsinh, String diachi, String nganh, String lop,  String khoa) {
        this.MSSV = MSSV;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
        this.diachi = diachi;
        this.nganh = nganh;
        this.lop = lop;
        this.khoa = khoa;
    }
    public String getMSSV() {
        return MSSV;
    }
    public String getTen() {
        return ten;
    }
    public String getNganh() {
        return nganh;
    }
    public String getGioitinh() {
        return gioitinh;
    }
    public String getNamsinh() {
        return namsinh;
    }  
    public String getDiachi() {
        return diachi;
    }
    public String getLop() {
        return lop;
    }
    public String getKhoa() {
        return khoa;
    }
    public String getDTB() {
        return dtb;
    }
    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }    
    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }  
    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }     
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }  
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    public void setDTB(String dtb) {
        this.dtb = dtb;
    }

    @Override
    public String toString() {
        return "Info{" + "MSSV=" + MSSV + ", ten=" + ten + ", gioitinh=" + gioitinh + ", namsinh=" + namsinh + ", diachi=" + diachi + ", nganh=" + nganh + ", lop=" + lop + ", khoa=" + khoa + ", dtb=" + dtb + '}';
    }

    


   


   


   

   
   
    
    
}