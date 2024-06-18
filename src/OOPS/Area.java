package OOPS;

public class Area {
    public static void main(String[] args){
        int length = 10;
        int width = 5;
        Area_calc a = new Area_calc();
        a.assign(length,width);
        System.out.println(a.sq(length));
        System.out.println(a.rect(length,width));
    }
}
