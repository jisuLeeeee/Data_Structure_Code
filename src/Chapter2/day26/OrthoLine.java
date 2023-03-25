package Chapter2.day26;

import Chapter2.day25.MyPoint2;

public class OrthoLine {
    public MyPoint2 u;
    public MyPoint2 v;

    public OrthoLine(MyPoint2 p, MyPoint2 q) {
        u = p;
        v = q;
        if(p.x > q.x || p.x == q.x && p.y > q.y)
            swap();
    }

    private void swap() {
        MyPoint2 tmp = u;
        u = v;
        v = tmp;
    }


    public OrthoLine(int x1, int y1, int x2, int y2) {
        u = new MyPoint2(x1, y1);
        v = new MyPoint2(x2, y2);
    }

    public boolean isVertical(){ // 수직선분인지 검사
        return u.x == v.x;
    }

    public boolean intersects(OrthoLine other){ // 다른선분과 현재 선분이 교차하는지에 대한 결과
        if(isVertical() && !other.isVertical() ){ // 현재선분은 수직이고 다른선분이 수평일 때
            return (other.u.x < u.x && other.v.x > u.x && u.y < other.u.y && v.y > other.u.y);
        } else if(!isVertical() && other.isVertical()){ // 현재선분은 수평이고 다른선분이 수직일 때
            return (other.u.y < u.y && other.v.y > u.y && u.x < other.u.x && v.x > other.u.x);
        } else
            return false;
    }
}
