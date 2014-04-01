import java.io.*;
import java.util.*;
public class Hand {
    int wan[]={0,0,0,0,0,0,0,0,0};;
    int tong[]={0,0,0,0,0,0,0,0,0};;
    int suo[]={0,0,0,0,0,0,0,0,0};;
    int zi[]={0,0,0,0,0,0,0,0,0};;

    public  void show(){
        //可改进
        for (int i=0;i<=8;i++)
        {   int t=this.wan[i];
            while(t!=0)
            {
              System.out.print(i + 1);
                t--;
            }
         }
        System.out.print("w");
        for (int i=0;i<=8;i++)
        {   int t=this.tong[i];
            while(t!=0)
            {
                System.out.print(i + 1);
                t--;
            }
        }
        System.out.print("p");
        for (int i=0;i<=8;i++)
        {   int t=this.suo[i];
            while(t!=0)
            {
                System.out.print(i + 1);
                t--;
            }
        }
        System.out.print("s");
        for (int i=0;i<=6;i++)
        {   int t=this.zi[i];
            while(t!=0)
            {
                System.out.print(i + 1);
                t--;
            }

        }
        System.out.println("z");
    }
    public boolean mopai(Tile a)
    {
        switch (a.huase) {
            case 'w':if (wan[a.num-1]<=3) {wan[a.num-1]=wan[a.num-1]+1;return true;} else return false;
            case 'p':if (tong[a.num-1]<=3) {tong[a.num-1]=tong[a.num-1]+1;return true;} else return false;
            case 's':if (suo[a.num-1]<=3) {suo[a.num-1]=suo[a.num-1]+1;return true;} else return false;
            case 'z':if (zi[a.num-1]<=3) {zi[a.num-1]=zi[a.num-1]+1;return true;} else return false;
     }
        return false;
}
    public boolean diupai(Tile a)
    {
        switch (a.huase) {
            case 'w':if (wan[a.num-1]>0) {wan[a.num-1]=wan[a.num-1]-1;return true;} else return false;
            case 'p':if (tong[a.num-1]>0) {tong[a.num-1]=tong[a.num-1]-1;return true;} else return false;
            case 's':if (suo[a.num-1]>0) {suo[a.num-1]=suo[a.num-1]-1;return true;} else return false;
            case 'z':if (zi[a.num-1]>0) {zi[a.num-1]=zi[a.num-1]-1;return true;} else return false;
        }
        return false;
    }
}


