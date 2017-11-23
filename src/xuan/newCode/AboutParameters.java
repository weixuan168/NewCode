package xuan.newCode;

/**
 * Created by Xuan on 2017/5/26.
 *
 * 知识点：java传参问题
 */
public class AboutParameters {
    int a = 30;
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    public void change(int n,String str, char ch[]) {
        n = 50;
        str = "newCode.ok";
        ch[0] = 'g';
    }

    public static void main(String[] args) {
        AboutParameters ex = new AboutParameters();
        ex.change(ex.a,ex.str, ex.ch);
        System.out.print(ex.a + " " + ex.str + " ");
        System.out.println(ex.ch);
    }

}
