package case_study.repository;

import case_study.model.Room;
import case_study.service.IFacilityService;

import java.util.List;

public interface IRoomRepository  {
   List<Room> display();
   void add(Room room);
}
