public class myCompare {
    static int myCompareTo(String o1, String o2) {
        char[] one = o1.toCharArray();
        char[] two = o2.toCharArray();
        int result = 0;
        int len = Math.min(two.length, one.length);
        for (int i = 0; i < len; i++) {
            if (one[i] == two[i]) continue;
            result = one[i] - two[i];
            break;
        }
        if (one.length > two.length && result == 0) {
            result += one.length - two.length;
        } else if (one.length < two.length && result == 0) {
            result += one.length - two.length;
        }
        return result;
    }

    public static void main(String[] args) {
        String tt = "Java";
        String ss = "Javaaa";
        System.out.println(tt.compareTo(ss));
        int compare = myCompareTo(tt, ss);
        System.out.println(compare);
    }
}
