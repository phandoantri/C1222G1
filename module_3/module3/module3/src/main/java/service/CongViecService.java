package service;

import model.CongViec;
import repository.CongViecRepository;
import repository.ICongViecRepository;

import java.util.List;

public class CongViecService implements ICongViecService{
    private ICongViecRepository iCongViecRepository=new CongViecRepository();
    @Override
    public List<CongViec> getAll() {
        return iCongViecRepository.getAll();
    }

    @Override
    public void delete(int id) {
        iCongViecRepository.delete(id);
    }
}
