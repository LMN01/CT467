/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package doanct467;

/**
 *
 * @author User
 */
public class Student {
    
    private String mssv;
    private String ten;
    private String gioitinh;
    private String namsinh;
    private String diachi;
    private String email;
    private String sdt;
    private String lop;
    private String nganh;
    private String khoa;
    private String ghichu;

    public Student() {
    }

    public Student(String mssv, String ten, String gioitinh, String namsinh, String diachi, String email, String sdt, String lop, String nganh, String khoa, String ghichu) {
        this.mssv = mssv;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
        this.diachi = diachi;
        this.email = email;
        this.sdt = sdt;
        this.lop = lop;
        this.nganh = nganh;
        this.khoa = khoa;
        this.ghichu = ghichu;
    }

    public String getMssv() {
        return mssv;
    }

    public String getTen() {
        return ten;
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

    public String getEmail() {
        return email;
    }

    public String getSdt() {
        return sdt;
    }

    public String getLop() {
        return lop;
    }

    public String getNganh() {
        return nganh;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    @Override
    public String toString() {
        return "Student{" + "mssv=" + mssv + ", ten=" + ten + ", gioitinh=" + gioitinh + ", namsinh=" + namsinh + ", diachi=" + diachi + ", email=" + email + ", sdt=" + sdt + ", lop=" + lop + ", nganh=" + nganh + ", khoa=" + khoa + ", ghichu=" + ghichu + '}';
    }

    
    
}