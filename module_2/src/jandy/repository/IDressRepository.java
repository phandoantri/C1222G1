package jandy.repository;

import jandy.model.Dress;

import java.util.List;

public interface IDressRepository {
    List<Dress> display();
    void add(Dress dress);
}
