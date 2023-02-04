public class myCompare {

    myCompare(String o1, String o2) {
        myCompareTo(o1, o2);
    }

    void myCompareTo(String o1, String o2) {
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
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";

        new myCompare(str1, str2);

    }
}
