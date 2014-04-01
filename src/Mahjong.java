/**
 * Created by ykcxu on 14-3-25.
 */


import java.io.*;
import java.util.*;
public class Mahjong {
    public static void main(String[] args){
        Hand  a = new Hand();
        a.suo[0]=1;
        Tile b = new Tile();
        b.num=1;
        b.huase='z';
        a.mopai(b);
       // System.out.print(a.suo[0]);
      a.show();
    }
}
