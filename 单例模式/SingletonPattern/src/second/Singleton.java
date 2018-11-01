package second;

//单例模式第二版，粗暴线程安全
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    //synchronized 关键字
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
