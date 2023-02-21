package ss4_lop_va_doi_tuong.thuc_hanh.hinh_chu_nhhat;

public class Rectangle {
    double width,height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getAria(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle { width = " + width+", height = "+height +"}";
    }

}
