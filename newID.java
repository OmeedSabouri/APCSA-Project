public class newID {
    public static int curNum = 0;

    public static int getID() {
        curNum++;
        return curNum;
    }
}
