package OOPS;

public class GetsPuts {
    public static void main(String[] args)
    {
        Manavan ob = new Manavan();
        ob.putId(10);
        ob.putName("RAM");
        ob.putCGPA(8);

        System.out.println(ob.getId());
        System.out.println(ob.getName());
        System.out.println(ob.getCGPA());
    }

}
class Manavan{
    private int id;
    private String name;
    private int GGPA = 8;

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getCGPA(){
        return this.GGPA;
    }

    public void putId(int i){
        this.id = i;
    }
    public void putName(String n){
        this.name = n;
    }
    public void putCGPA(int c){
        this.GGPA = c;
    }
}
