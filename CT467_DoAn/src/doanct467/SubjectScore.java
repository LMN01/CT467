/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package doanct467;

/**
 *
 * @author User
 */
public class SubjectScore {
    private String MSSV;
    private String ten;
    private String mamon;
    private String tenmh;
    private int stc;
    private float kq;
    public SubjectScore() {
    }

    public SubjectScore(String MSSV, String ten, String mamon, String tenmh,  int stc, float kq) {
        this.MSSV = MSSV;
        this.ten = ten;
        this.mamon = mamon;
        this.tenmh = tenmh;
        this.stc = stc;
        this.kq = kq;
    }
    public String getMSSV() {
        return MSSV;
    }
    public String getTen() {
        return ten;
    }
    public String getMaMon() {
        return mamon;
    }

    public String getTenMH() {
        return tenmh;
    }

    public int getSTC() {
        return stc;
    }
    public float getKQ() {
        return kq;
    }

    public float getFloat(int a, float kq) {
        return kq;
    }
    public int getInt(int a, int stc) {
        return stc;
    }
    
    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }    
    public void setMaMon(String mamon) {
        this.mamon = mamon;
    }

    public void setTenMH(String tenmh) {
        this.tenmh = tenmh;
    }

    public void setSTC(int stc) {
        this.stc = stc;
    }
    public void setKQ(int kq) {
        this.kq = kq;
    }

    @Override
    public String toString() {
        return "SubjectScore{" + "MSSV=" + MSSV + ", ten=" + ten + ", mamon=" + mamon + ", tenmh=" + tenmh + ", stc=" + stc + ", kq=" + kq + '}';
    }


   

   
   
    
    
}