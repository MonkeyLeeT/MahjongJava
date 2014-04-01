/**
 * Created by ykcxu on 14-3-28.
 */
public class Pass {
    public boolean test(Hand a,Block b){
        for(Tile x:b.pai)
        {
            if (!a.diupai(x)) return false;
        }
        return true;
    }
}
