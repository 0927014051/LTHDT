/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class TaiKhoan {
    private String TenDangNhap;
    private String MatKhau;
    private String maNV;
    private String LoaiTaiKhoan;
    public String getLoaiTaiKhoan() {
        return LoaiTaiKhoan;
    }

    public void setLoaiTaiKhoan(String LoaiTaiKhoan) {
        this.LoaiTaiKhoan = LoaiTaiKhoan;
    }
    


    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public TaiKhoan(String TenDangNhap, String MatKhau, String maNV,String LoaiTaiKhoan) {
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.maNV = maNV;
        this.LoaiTaiKhoan = LoaiTaiKhoan;
    }
    public TaiKhoan(){
        
    }
}
