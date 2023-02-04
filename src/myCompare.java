public class myCompare {
    static int myCompareTo(String javaIn, String ASPin) {
        char[] java = javaIn.toCharArray();
        char[] ASP = ASPin.toCharArray();
        int result = 0;
        for (int i = 0; i < ASP.length; i++) {
            if (java[i] == ASP[i]) continue;
            result = java[i] - ASP[i];
            break;
        }
        if (java.length > ASP.length && result == 0) {
            result += java.length - ASP.length;
        } else if (java.length < ASP.length && result == 0) {
            result += ASP.length - java.length;
        }
        return result;
    }

    public static void main(String[] args) {
        String tt = "Java";
        String ss = "ASP";
        System.out.println(myCompareTo(tt, ss));
    }
}
