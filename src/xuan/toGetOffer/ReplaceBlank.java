package xuan.toGetOffer;

/**
 * 面试题4：
 * <p>
 * 把字符串中的每个空格替换成"%20"
 */
public class ReplaceBlank {

    public static String replace(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            }else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
