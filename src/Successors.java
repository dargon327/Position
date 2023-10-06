public class Successors {
    int[][] arr;
    public Successors(int[][] arr) {
        this.arr = arr;
    }
    public static Position findPosition(int a, int[][] b) {
        for (int i = 0; i < b.length; i++)  {
            for (int j = 0; j < b[i].length;j++) {
                if (a == b[i][j]) {
                    Position ret = new Position(i,j);
                    return ret;
                }
            }
        }
        return null;
    }
    public static Position[][] getSuccessorArray(int[][] a) {
        Position[][] ret = new Position[a.length][a[0].length];
        for (int i = 0; i < a.length;i++) {
            for (int j = 0; j < a[i].length;j++) {
                boolean b = false;
                int temp = a[i][j] + 1;
                for (int k = 0; k < a.length; k++) {
                    for (int l = 0; l < a[k].length;l++) {
                        if (temp == a[k][l]) {
                            ret[i][j] = new Position(k,l);
                            b = true;
                            break;
                        }

                    }
                    if (b) {break;}
                }
                if (b) continue;
                ret[i][j] = null;
            }
        }
        return ret;
    }
}
