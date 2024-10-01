import java.util.Scanner;
public class quadrant_prob {
    public static int quadrant(double x,double y){
        if(x==0||y==0){
            return 0;
        }
        else{
            if(x>0&&y>0){
                return 1;
            }
            if(x<0&&y>0){
                return 2;
            }
            if(x<0&&y<0){
                return 3;
            }
            else
                return 4;
        }
    }

    public static void main(String[] args){
        /*这里的输入怎么写？？*/
    }
}
