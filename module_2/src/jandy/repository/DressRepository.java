package jandy.repository;

import jandy.common.DressReader;
import jandy.common.DressWriter;
import jandy.model.Dress;
import ss17_ioBinary.common.WriteFile;

import java.util.ArrayList;
import java.util.List;

public class DressRepository implements IDressRepository{
    public static final String PATH="src/jandy/file/dress_csv";

    @Override
    public List<Dress> display() {
        return DressReader.read(PATH);
    }

    @Override
    public void add(List<Dress> dressList) {
        DressWriter.write(PATH,dressList);
    }

    @Override
    public void delete(int i) {
        List<Dress> dressList=DressReader.read(PATH);
        dressList.remove(i);
        DressWriter.write(PATH,dressList);
    }


}
