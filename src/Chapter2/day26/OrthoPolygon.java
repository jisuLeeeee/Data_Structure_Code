package Chapter2.day26;

import Chapter2.day25.MyPoint2;

public class OrthoPolygon {
    public int n; // 다각형의 꼭짓점 개수
    public MyPoint2[] vertices; // 꼭짓점의 집합
    public OrthoPolygon(int k){
        n = 0;
        vertices = new MyPoint2[k];
    }

    public void addVertex(int x, int y){
        vertices[n++] = new MyPoint2(x, y);
    }

    public int maxX(){
        int max = vertices[0].x;
        for(int i=0; i<n; i++){
            if(vertices[i].x > max)
                max = vertices[i].x;
        }
        return max;
    }

    public boolean contains(MyPoint2 p){ // 내부에 포함된 좌표인지를 검사
        OrthoLine arrow = new OrthoLine(p, new MyPoint2(maxX()+1,p.y));
        int count = 0;
        for(int i=0; i<n; i++){
            OrthoLine edge = new OrthoLine(vertices[i], vertices[(i+1) % n]);
            if(arrow.intersects(edge))
                count++;
        }
        return (count % 2 == 1); // 홀수면 포함
    }
}
