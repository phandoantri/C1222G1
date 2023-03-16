package case_study.repository;

import case_study.model.Villa;

import java.util.List;

public interface IVillageRepository {
    List<Villa> display();
    void add(Villa villa);
}
