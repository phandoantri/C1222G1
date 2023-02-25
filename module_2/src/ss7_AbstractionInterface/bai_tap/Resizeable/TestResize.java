package ss7_AbstractionInterface.bai_tap.Resizeable;

public class TestResize {
    public static void main(String[] args) {
       Rectangle rect=new Rectangle();
       rect.setLength(2);
       rect.setWidth(2);
       rect.resize(50);
        System.out.println(rect);

    }
}
