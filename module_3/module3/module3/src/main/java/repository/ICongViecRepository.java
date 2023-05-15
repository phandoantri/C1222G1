package repository;

import model.CongViec;

import java.util.List;

public interface ICongViecRepository {
    List<CongViec> getAll();
    void delete(int id);
}
