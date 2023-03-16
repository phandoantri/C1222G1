package case_study.repository;

import case_study.common.ReadFileRoom;
import case_study.common.WriteFileRoom;
import case_study.model.Room;

import java.util.List;

public class RoomRepository implements IRoomRepository{
    public static final String PATH="src/case_study/data/room_txt";
    List<Room> roomList= ReadFileRoom.read(PATH);
    @Override
    public List<Room> display() {
        return ReadFileRoom.read(PATH);
    }

    @Override
    public void add(Room room) {
        WriteFileRoom.write(PATH,room);

    }
}
