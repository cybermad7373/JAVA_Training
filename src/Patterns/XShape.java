package Patterns;

public class XShape {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0,k=n;i<n;i++,k--){
            for(int j = 0;j<n;j++){
                if(i==j){
                    System.out.print(i+1);
                    continue;
                }
                if(i+j==n-1)
                    System.out.print(k);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

//        1   5
//         2 4
//          3
//         2 4
//        1   5