/**
 * Created by ykcxu on 14-3-25.
 */
public class Block{
    Tile[] pai;

    public boolean build(Tile a[])
    {
        pai=a;
        return true;
    }
    public int fushu()
    {
       return 2;；
    }

}
