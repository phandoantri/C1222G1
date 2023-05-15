package repository;

import model.CongViec;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CongViecRepository implements ICongViecRepository {
    public static final String SELECT_FROM_CONG_VIEC = "select c.id_cong_viec,c.ten_cong_viec,c.ngay_bat_dau,c.deadline,tt.ten_trang_thai,c.mo_ta_them from cong_viec c join trang_thai tt on tt.id_trang_thai = c.id_trang_thai;";
    public static final String DELETE_FROM_CONG_VIEC = "delete from cong_viec where id_cong_viec=?;";

    @Override
    public List<CongViec> getAll() {
        List<CongViec> congViecList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement(SELECT_FROM_CONG_VIEC);
            ResultSet resultSet = preparedStatement.executeQuery();
            CongViec congViec;
            while (resultSet.next()) {
                int idCongViec = resultSet.getInt("id_cong_viec");
                String tenCongViec = resultSet.getString("ten_cong_viec");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                String deadline = resultSet.getString("deadline");
                String trangThai = resultSet.getString("ten_trang_thai");
                String moTaThem = resultSet.getString("mo_ta_them");
                congViec = new CongViec(idCongViec, tenCongViec, ngayBatDau, deadline, trangThai, moTaThem);
                congViecList.add(congViec);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return congViecList;
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement(DELETE_FROM_CONG_VIEC);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
