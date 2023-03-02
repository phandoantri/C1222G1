package demo_MVC.service;

import demo_MVC.repository.TruyenRepository;

public class TruyenService implements ITruyenService {
    private  TruyenRepository truyenRepository = new TruyenRepository();

    @Override
    public void hienThi() {
        truyenRepository.hienThi();
    }

    @Override
    public void xoa(String ma) {
        truyenRepository.xoa(ma);
    }
}

