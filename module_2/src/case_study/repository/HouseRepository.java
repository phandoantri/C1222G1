package case_study.repository;

import case_study.common.ReadFileHouse;
import case_study.common.WriteFileHouse;
import case_study.model.House;

import java.util.List;

public class HouseRepository implements IHouseRepository{
    public static final String PATH="src/case_study/data/house_txt";
List<House> houseList= ReadFileHouse.read(PATH);
    @Override
    public List<House> display() {
        return ReadFileHouse.read(PATH);
    }

    @Override
    public void add(House house) {
        WriteFileHouse.write(PATH,house);
    }
}
