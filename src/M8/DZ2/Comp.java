package M8.DZ2;
class Comp implements Comparable{
    String str;
    Comp(String str) {
        this.str = str;
        }
    public int compareTo(Object obj) {
        Comp entry = (Comp) obj;
        int result = str.compareTo(entry.str);
        if(result != 0) {
            return result;
            }
        return 0;
        }
    }