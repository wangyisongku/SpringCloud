/**
 * @ProjectName: SpringCloud
 * @Package: PACKAGE_NAME
 * @ClassName: AA
 * @Author: wangy
 * @Description: ${description}
 * @Date: 2019/4/7 15:26
 * @Version: 1.0
 */
public class AA extends BB{

    public static void main(String[] args){
        BB bb = new AA();
        BB aa = new AA();
        bb.say();
        aa.say();
    }

    @Override
    public void say(){
        System.out.println("我是儿子");
    }
}
