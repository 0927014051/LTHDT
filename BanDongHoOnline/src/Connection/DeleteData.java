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
public class DeleteData {
     public static boolean deleteTaiKhoan(TaiKhoan taiKhoan) {
        String sqlCommand = "delete into dbo.TaiKhoan values(?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, taiKhoan.getTenDangNhap());
           // ps.setString(3, taiKhoan.getLoaiTaiKhoan());
            ps.executeUpdate();

            System.out.println("Xóa tài khoản thành công");
        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa tài khoản thất bại");
        return false;

    }
     public static boolean deletetNhanVien(NhanVien nv) {
        String sqlCommand = "delete into dbo.NhanVien values(?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, nv.getMaNV());

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa nhân viên thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa nhân viên thất bại");
        return false;
    }
     
    public static boolean delelteKhachHang(KhachHang kh){
        String sqlCommand = "delete into dbo.KhachHang values(?,?,?,?,?)";
        try{
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, kh.getMaKH());

            
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa khách hàng thành công");
                return true;
        }
         } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa khách hàng thất bại");
        return false;
    }
    public static boolean deleteDongHo(DongHo dh) {
        String sqlCommand = "delete into dbo.DongHo values(?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, dh.getMaDH());
            

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa đồng hồ thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa đồng hồ thất bại");
        return false;
    }
    public static boolean insertPhieuDat(PhieuDat pd) {
        String sqlCommand = "delete into dbo.PhieuDat values(?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, pd.getMaPD());

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa phiếu đặt thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa phiếu đặt thất bại");
        return false;
    }

    public static boolean deleteHoaDon(HoaDon hd) {
        String sqlCommand = "insert into dbo.HoaDon values(?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, hd.getMaHD());
            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa hóa đơn thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa hóa đơn thất bại");
        return false;
    }
     public static boolean deleteBaoHanh(CT_PhieuBaoHanh bh) {
        String sqlCommand = "delete into dbo.BaoHanh values(?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, bh.getMaPBH());
   
          

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa phiếu bảo hành thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa phiếu bảo hành thất bại");
        return false;
    }
       public static boolean deleteKhuyenMai(KhuyenMai km) {
        String sqlCommand = "delete into dbo.KhuyenMai values(?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, km.getMaKM());
            
   
          

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa khuyến mãi thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Xóa khuyến mãi thất bại");
        return false;
    }
        public static boolean delelteCT_KhuyenMai(CT_KhuyenMai ctkm){
            String sqlCommand = "delete into dbo.CT_KhuyenMai values(?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1,ctkm.getMaKM());
           
            if (ps.executeUpdate() > 0) {
                System.out.println("xóa chi tiết khuyến mãi thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa chi tiết khuyến mãi thất bại");
        return false;
       }
     public static boolean deleteCT_PhieuBaoHanh(PhieuBaoHanh ctbh){
            String sqlCommand = "delete into dbo.CT_PhieuBaoHanh values(?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, ctbh.getMaPBH());
           
            if (ps.executeUpdate() > 0) {
                System.out.println("xóa chi tiết bảo hành thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa chi tiết bảo hành thất bại");
        return false;
       }
     public static boolean deleteCT_PhieuDat(CT_PhieuDat ctpd){
            String sqlCommand = "delete into dbo.CT_PhieuDat values(?,?,?,?,?,?)";
        try {
            DataConnection.createStatement();
            PreparedStatement ps = DataConnection.connection.prepareStatement(sqlCommand);
            ps.setString(1, ctpd.getMaPD());
           
            if (ps.executeUpdate() > 0) {
                System.out.println("xóa chi tiết phiếu đặt thành công");
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DeleteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("xóa chi tiết phiếu đặt thất bại");
        return false;
       }
     
}
