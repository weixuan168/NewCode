package xuan.newCode;

/**
 * Created by Xuan on 2017/6/12.
 */
public class AboutParseInt {

    /**
     * 运行结果如下：
     * Result: 123 In 0th loop
     * error ：abc In 1th loop
     * error ：abc In 2th loop
     * error ：abc In 3th loop
     * <p>
     * parseInt函数说明：
     * 将一个字符串参数解析成一个有符号十进制整数。该字符串里的所有字符必须是十进制数字，
     * 两个例外：第一个字符是ASCII码里的负号（'-','\u005Cu002D'），或正号('+','\u005Cu002B')。
     * 如果字符串里有不可解析的字符，则抛出
     * @throws NumberFormatException
     */
    public static void main(String args[]) {
        String a[] = {"123", "abc", "12b", null};
        for (int i = 0; i < 4; i++) {
            try {
                int x = Integer.parseInt(a[i]);
                System.out.print("Result: " + x + " ");
            } catch (NullPointerException e) {
                System.out.print("error null：" + " ");
            } catch (NumberFormatException e) {
                System.out.print("error ：abc" + " ");
            } finally {
                System.out.print("In " + i + "th loop\n");
            }
        }
    }

}
