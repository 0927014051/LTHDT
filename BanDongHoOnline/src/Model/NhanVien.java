/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String MaNV, HoNV, TenNV, gtNV, dcNV, stdNV,TenDangNhap;  
    private Date nsNV;

    public NhanVien(String MaNV, String HoNV, String TenNV, String gtNV, Date nsNV, String dcNV, String stdNV, String TenDangNhap ) {
            this.MaNV = MaNV;
            this.HoNV = HoNV;
            this.TenNV = TenNV;
            this.dcNV = dcNV;
            this.gtNV = gtNV;
            this.stdNV = stdNV;
            this.nsNV = nsNV;
            this.TenDangNhap = TenDangNhap;
           
    }
 
    public String getMaNV() {
        return MaNV;
    }

    public String getHoNV() {
        return HoNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public String getGtNV() {
        return gtNV;
    }

    public Date getNsNV() {
        return nsNV;
    }

    public String getDcNV() {
        return dcNV;
    }

    public String getStdNV() {
        return stdNV;
    }

   
    public String getTenDangNhap(){
        return TenDangNhap;
    }
    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setHoNV(String HoNV) {
        this.HoNV = HoNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public void setGtNV(String gtNV) {
        this.gtNV = gtNV;
    }

    public void setNsNV(Date nsNV) {
        this.nsNV = nsNV;
    }

    public void setDcNV(String dcNV) {
        this.dcNV = dcNV;
    }

    public void setStdNV(String stdNV) {
        this.stdNV = stdNV;
    }

  
    public void setTenDangNhap(String TenDangNhap){
        this.TenDangNhap = TenDangNhap;
    }
    
}
