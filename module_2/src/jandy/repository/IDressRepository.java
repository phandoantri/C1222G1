package jandy.repository;

import jandy.model.Dress;

import java.util.List;

public interface IDressRepository {
    List<Dress> display();
    void add(List<Dress> dress);

    void delete(int i);
}
