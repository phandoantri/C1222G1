package case_study.repository;

import case_study.model.House;
import case_study.service.IFacilityService;

import java.util.List;

public interface IHouseRepository  {
   List<House> display();
   void add(House house);
}
