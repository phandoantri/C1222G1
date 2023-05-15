package service;

import model.CongViec;

import java.util.List;

public interface ICongViecService {
    List<CongViec> getAll();
    void delete(int id);
}
