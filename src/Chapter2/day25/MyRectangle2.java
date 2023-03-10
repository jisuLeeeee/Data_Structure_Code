package Chapter2.day25;

public class MyRectangle2 {
    public MyPoint2 le; // 왼쪽-위 꼭짓점
    public int width, height;

    public MyRectangle2(int x, int y, int width, int height) {
        le = new MyPoint2(x, y);
        this.width = width;
        this.height = height;
    }
    public int calcArea(){
        return width * height;
    }
    public String toString(){
        return "(" + le.x + ", " + le.y + ") " + width + " " + height;
    }
}
