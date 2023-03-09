package demo_MVC.view;

import demo_MVC.common.WriteFile;
import demo_MVC.controller.TruyenController;

public class View {
   public static void main(String[] args) {
        TruyenController truyenController=new TruyenController();
        truyenController.quanLy();
       WriteFile.writeFile("src/demo_MVC/repository/file.csv");
    }

}
