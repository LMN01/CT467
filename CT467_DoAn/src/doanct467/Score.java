/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package doanct467;

/**
 *
 * @author User
 */
public class Score {
    private String MSSV;
    private String mamon;
    private float kq;
    public Score() {
    }

    public Score(String MSSV, String mamon,  float kq) {
        this.MSSV = MSSV;
        this.mamon = mamon;
        this.kq = kq;

    }
     public String getMSSV() {
        return MSSV;
    }
    public String getMaMon() {
        return mamon;
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
    public void setFloat(int a, float kq) {
        this.kq = kq;
    }
    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }
    public void setMaMon(String mamon) {
        this.mamon = mamon;
    }

    public void setKQ(float kq) {
        this.kq = kq;
    }

    @Override
    public String toString() {
        return "Score{" + "MSSV=" + MSSV + ", mamon=" + mamon + ", kq=" + kq + '}';
    }

   
   
    
    
}