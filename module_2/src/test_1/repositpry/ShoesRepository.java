package test_1.repositpry;

import test_1.common.ReadFileShoes;
import test_1.common.WriteFileShoes;
import test_1.model.Shoes;

import java.util.List;

public class ShoesRepository implements IShoesRepository{
    public static final String PATH="src/test_1/data/shoes_csv";
    @Override
    public List<Shoes> display() {
        return ReadFileShoes.read(PATH);
    }

    @Override
    public void add(List<Shoes> shoesList) {
        WriteFileShoes.write(PATH,shoesList);
    }

    @Override
    public void delete(int i) {
        List<Shoes> shoesList=ReadFileShoes.read(PATH);
        shoesList.remove(i);
        WriteFileShoes.write(PATH,shoesList);
    }

    @Override
    public void search(int i) {
        List<Shoes> shoesList=ReadFileShoes.read(PATH);
        System.out.println(shoesList.get(i));

    }
}
