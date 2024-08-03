package Patterns;

public class FloidLike {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0,k=n;i<n;i++,k--){
            int temp= i;
            for(int j = k;j>=0;j--){
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print(temp);
                temp--;
            }
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


//           0
//          101
//         21012
//        3210123