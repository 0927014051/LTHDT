package Connection;

import java.lang.reflect.Array;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
/**
 *
 * @author conghau
 */
public class UpdateData {
     public static boolean updateNhanVien(NhanVien nv) {
        String sqlCommand = "update into dbo.NhanVien values(?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, nv.getMaNV());
            ps.setString(2, nv.getHoNV());
            ps.setString(3, nv.getTenNV());
            ps.setString(4, nv.getTenDangNhap());
            ps.setString(5, nv.getGtNV());
            ps.setDate(6, (Date) nv.getNsNV());
            ps.setString(7, nv.getDcNV());
            ps.setString(8, nv.getEmailNV());
            ps.setString(9, nv.getStdNV());
            ps.setBigDecimal(10,nv.getLuong());

            if (ps.executeUpdate() > 0) {
                System.out.println("sửa nhân viên thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa nhân viên thất bại");
        return false;
    }
     
    public static boolean updateKhachHang(KhachHang kh){
        String sqlCommand = "update into dbo.KhachHang values(?,?,?,?,?)";
        try{
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getCMND());
            ps.setString(3, kh.getHoKH());
            ps.setString(4,kh.getTenKH());
            ps.setString(5, kh.getGtKH());
            ps.setDate(6, (Date)kh.getNsKH());
            ps.setString(7, kh.getDcKH());
            ps.setString(8, kh.getEmailKH());
            ps.setString(9, kh.getStdKH());
            ps.setString(10, kh.getMSTKH());
            
            
            if (ps.executeUpdate() > 0) {
                System.out.println("sửa khách hàng thành công");
                return true;
        }
         } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa khách hàng thất bại");
        return false;
    }
    public static boolean updateDongHo(DongHo dh) {
        String sqlCommand = "update into dbo.DongHo values(?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, dh.getMaDH());
            ps.setString(2, dh.getTenDH());
            ps.setInt(3, dh.getSLTon());
            ps.setBigDecimal(4, dh.getGia());
            ps.setString(5, dh.getTrangThai());
            ps.setBytes(6, dh.getHinhAnh()); 
            

            if (ps.executeUpdate() > 0) {
                System.out.println("sửa đồng hồ thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa đồng hồ thất bại");
        return false;
    }
    public static boolean updatePhieuDat(PhieuDat pd) {
        String sqlCommand = "update into dbo.PhieuDat values(?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, pd.getMaPD());
            ps.setString(2, pd.getHoKH());
            ps.setString(3, pd.getTenKH());
            ps.setString(4, pd.getDcKH());
            ps.setDate(5, pd.getNgayGiao());

            if (ps.executeUpdate() > 0) {
                System.out.println("sửa phiếu đặt thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa phiếu đặt thất bại");
        return false;
    }

    public static boolean updateHoaDon(HoaDon hd) {
        String sqlCommand = "update into dbo.HoaDon values(?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, hd.getMaHD());
            ps.setDate(2, hd.getNgayIn());
            if (ps.executeUpdate() > 0) {
                System.out.println("sửa hóa đơn thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa hóa đơn thất bại");
        return false;
    }
     public static boolean updateBaoHanh(CT_PhieuBaoHanh bh) {
        String sqlCommand = "insert into dbo.BaoHanh values(?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, bh.getMaPBH());
            ps.setString(2, bh.getTrangThai());
   
          

            if (ps.executeUpdate() > 0) {
                System.out.println("sửa phiếu bảo hành thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa phiếu bảo hành thất bại");
        return false;
    }
       public static boolean updateKhuyenMai(KhuyenMai km) {
        String sqlCommand = "update into dbo.KhuyenMai values(?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, km.getMaKM());
            ps.setDate(2, km.getNgayBD());
            ps.setDate(2, km.getNgayKT());
            
   
          

            if (ps.executeUpdate() > 0) {
                System.out.println("sửa khuyến mãi thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửakhuyến mãi thất bại");
        return false;
    }
       public static boolean updateCT_KhuyenMai(CT_KhuyenMai ctkm){
            String sqlCommand = "update into dbo.CT_KhuyenMai values(?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setInt(1, ctkm.getPTKM());
            ps.setString(2,ctkm.getMaKM());
            ps.setString(3, ctkm.getMaDH());
           
            if (ps.executeUpdate() > 0) {
                System.out.println("sửa chi tiết khuyến mãi thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa chi tiết khuyến mãi thất bại");
        return false;
       }
     public static boolean updateCT_PhieuBaoHanh(PhieuBaoHanh ctbh){
            String sqlCommand = "update into dbo.CT_PhieuBaoHanh values(?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, ctbh.getMaPBH());
            ps.setString(2,ctbh.getMaDH());
            ps.setDate(3, ctbh.getNgayBD());
            ps.setDate(4, ctbh.getNgayKT());
           
            if (ps.executeUpdate() > 0) {
                System.out.println("sửa chi tiết bảo hành thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa chi tiết bảo hành thất bại");
        return false;
       }
     public static boolean updatetCT_PhieuDat(CT_PhieuDat ctpd){
            String sqlCommand = "update into dbo.CT_PhieuDat values(?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, ctpd.getMaPD());
            ps.setString(2,ctpd.getMaDH());
            ps.setInt(3, ctpd.getSoLuong());
            ps.setBigDecimal(4, ctpd.getGia());
           
            if (ps.executeUpdate() > 0) {
                System.out.println("sửa chi tiết phiếu đặt thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("sửa chi tiết phiếu đặt thất bại");
        return false;
       }
      public static boolean doiMatKhau(TaiKhoan tk, String mk ) {
        String sqlCommand = "update dbo.TaiKhoan set   MatKhau = ? " + " where TenDangNhap=?"  ;
         
        try { 
            DataConnection.createStatement();
            PreparedStatement  ps = DataConnection.connection.prepareStatement(sqlCommand);
 
            ps.setString(1, mk );
            ps.setString(2, tk.getTenDangNhap());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(UpdateData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Đổi mật khẩu thất bại");
        return false;
    }
}
