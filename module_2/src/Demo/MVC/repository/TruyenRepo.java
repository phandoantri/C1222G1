//package Demo.MVC.repository;
//
//import java.util.ArrayList;
//
//public class TruyenRepo implements ITruyenrepo {
//    static List<Truyen> list = new ArrayList<>();
//    static {
//        list.add(new Truyen("01","02","03","04"));
//        list.add(new Truyen("05","02","03","04"));
//    }
//
//    @Override
//    public void hienThi() {
//        for(Truyen truyen : list){
//            System.out.println(truyen.toString());
//        }
//    }
//
//    @Override
//    public void xoa(String maTruyen) {
//        for (int i = 0; i < list.size() ; i++) {
//            if(list.get(i).getMa().equals(maTruyen)){
//                list.remove(list.get(i));
//                return;
//            }
//        }
//        System.out.println("khong co truyen nay");
//    }
//}
