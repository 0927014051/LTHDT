/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Date;
/**
 *
 * @author Admin
 */
public class CT_PhieuBaoHanh {
    private String MaPBH, TrangThai;
    private String MaDH;
    

    public CT_PhieuBaoHanh() {
    }

    public CT_PhieuBaoHanh(String MaPBH, String TrangThai, String MaDH) {
        this.MaPBH = MaPBH;
        this.TrangThai = TrangThai;
        this.MaDH = MaDH;
    }

    public String getMaPBH() {
        return MaPBH;
    }

    public String getTrangThai() {
        return TrangThai;
    }


    public void setMaPBH(String MaPBH) {
        this.MaPBH = MaPBH;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
    public String getMaDH() {
            return MaDH;
    }

    public void setMaDH(String MaDH) {
            this.MaDH = MaDH;
    }

}
