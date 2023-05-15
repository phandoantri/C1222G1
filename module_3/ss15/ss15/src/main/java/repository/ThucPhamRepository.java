package repository;

import model.ThucPham;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThucPhamRepository implements IThucPhamRepository{
    public static final String SHOW_LIST_THUC_PHAM="select tp.id, tp.name, tp.NSX, tp.HSD, tp.id_ltp, tp.mo_ta,ltp.name_ltp from thuc_pham tp join loai_thuc_pham ltp on ltp.id_ltp = tp.id_ltp;";
    public static final String DELETE_THUC_PHAM="delete from thuc_pham where id=?;";
    @Override
    public List<ThucPham> getAll() {
        List<ThucPham> thucPhamList=new ArrayList<>();
        try {
            PreparedStatement preparedStatement=BaseRepository.getConnection().prepareStatement(SHOW_LIST_THUC_PHAM);
            ResultSet resultSet=preparedStatement.executeQuery();
            ThucPham thucPham;
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String ten=resultSet.getString("name");
                String NXS=resultSet.getString("NSX");
                String HSD=resultSet.getString("HSD");
                int idLTP=resultSet.getInt("id_ltp");
                String moTa=resultSet.getString("mo_ta");
                String tenLTP=resultSet.getString("name_ltp");
                thucPham=new ThucPham(id,ten,NXS,HSD,idLTP,moTa,tenLTP);
                thucPhamList.add(thucPham);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return thucPhamList;
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement preparedStatement=BaseRepository.getConnection().prepareStatement(DELETE_THUC_PHAM);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }
}
