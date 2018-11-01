package first;

//单例模式第一版
public class Singleton {

    private static Singleton instance;

    //私有构造器方法
    private Singleton() {
    }

    //唯一获取实例方法
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
