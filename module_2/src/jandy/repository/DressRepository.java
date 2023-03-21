package jandy.repository;

import jandy.common.DressReader;
import jandy.common.DressWriter;
import jandy.model.Dress;

import java.util.ArrayList;
import java.util.List;

public class DressRepository implements IDressRepository{
    public static final String PATH="src/jandy/file/dress_csv";
List<Dress> dressList=DressReader.read(PATH);
    @Override
    public List<Dress> display() {
        return DressReader.read(PATH);
    }

    @Override
    public void add(Dress dress) {
        DressWriter.write(PATH,dress);
    }
}
