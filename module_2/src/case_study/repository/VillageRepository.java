package case_study.repository;

import case_study.common.ReadFileVillage;
import case_study.common.WriteFileVillage;
import case_study.model.Villa;
import ss17_ioBinary.common.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class VillageRepository implements IVillageRepository{
    public static final String PATH="src/case_study/data/village_txt";
List<Villa> villaList= ReadFileVillage.read(PATH);
    @Override
    public List<Villa> display() {
        return ReadFileVillage.read(PATH);
    }

    @Override
    public void add(Villa villa) {
        WriteFileVillage.Write(PATH,villa);
    }
}
