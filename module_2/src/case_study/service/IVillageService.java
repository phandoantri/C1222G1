package case_study.service;

import case_study.model.Villa;

import java.util.List;

public interface IVillageService extends IFacilityService{
    @Override
    void display();

    @Override
    void add();
}
