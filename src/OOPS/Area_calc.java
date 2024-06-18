package OOPS;

public class Area_calc {
    int len;
    int wid;
    public void assign(int l,int w){
        len = l;
        wid = w;
    }
    public int sq(int side){
        return side * side;
    }
    public int rect(int len, int wid){
        return len*wid;
    }
}
