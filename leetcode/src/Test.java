/**
 * @author xiao.mi
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/7/8 18:11
 */
public class Test {

    public static void main(String[] args) {
        try {
            for(int i = 0; i < 100; i++){
                System.out.println("s");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}