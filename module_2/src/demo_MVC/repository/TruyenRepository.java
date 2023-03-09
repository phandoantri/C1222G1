package demo_MVC.repository;

import demo_MVC.model.Truyen;

import java.util.ArrayList;
import java.util.List;

public class TruyenRepository implements ITruyenRepository{
static List<Truyen> list=new ArrayList<>();
static {
    list.add(new Truyen("abc","scs","scs","tri") );
    list.add(new Truyen("abc","ses","sgs","danh") );

}
    @Override
    public List<Truyen> hienThi() {
      for (Truyen truyen:list){
          System.out.println(truyen);
      }
      return list;
    }

    @Override
    public void xoa(String ma) {
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i).getMa().equals(ma)){
                list.remove(list.get(i));
                return;
            }
        }
        System.out.println("khong tim thay ma trong list ");
    }
}
