package test_1.repositpry;

import test_1.model.Shoes;

import java.util.List;

public interface IShoesRepository {
    List<Shoes> display();
    void add(List<Shoes> shoesList);
    void delete(int i);
    void search(int i);
}
