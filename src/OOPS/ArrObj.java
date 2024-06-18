package OOPS;

import java.util.Scanner;
public class ArrObj {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of students : ");
        int n = sc.nextInt();
        Students[] arr = new Students[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll no of student "+ (i+1));
            int r = sc.nextInt();
            System.out.print("Enter the name of Student "+ (i+1));
            String str = sc.next();
            System.out.print("Enter the mark od student "+ (i+1));
            int m = sc.nextInt();
            arr[i] = new Students(r,str,m,n);
        }
        System.out.println();
        for(int j = 0 ; j <n;j++)
        {
            arr[j].display();
        }
    }

}
class Students{
    int Roll;
    String name;
    int mark;
    int count;

    Students(int r,String n,int m,int c)
    {
        this.Roll = r;
        this.name = n;
        this.mark = m;
        this.count = c;
    }
//    public int avgerage()
    public void display()
    {
        System.out.println(name+" of Roll no "+Roll+" has got "+mark+" marks ");
    }
}