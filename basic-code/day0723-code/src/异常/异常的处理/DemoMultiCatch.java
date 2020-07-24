package 异常.异常的处理;
/*
    多个异常使用捕获
    格式：
        try{
            编写可能出现异常的代码
        }catch(异常类型A e){
            当try中出现异常类型A，就用该catch捕获
            处理异常的代码
            //记录日志、打印异常信息/继续抛出异常
        }catch(异常类型B e){
             当try中出现异常类型B，就用该catch捕获
            处理异常的代码
            //记录日志、打印异常信息/继续抛出异常
        }

    注意：
    一个try多个catch注意事项：
        catch里面定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上面，否则就会报错
 */

public class DemoMultiCatch {
    public static void main(String[] args) {


    }
}
