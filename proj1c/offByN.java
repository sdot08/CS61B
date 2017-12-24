/**
 * Created by hp on 2017/7/13 .
 */
public class offByN implements CharacterComparator {
    int N;
    public offByN(int N){
        this.N=N;
    }
    public boolean equalChars(char x, char y){
        if(Math.abs(x-y)==N)
            return true;
        else
            return false;
    }

}
