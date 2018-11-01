## 单例模式

### 概念

　　保证一个类仅有一个实例，并提供一个访问它的全局访问点。

### 简单的单例模式

　　通常我们可以让一个全局变量使得一个对象被访问，但它不能防止你实例多个对象。一个最好的方法就是，让类自身负责保存它唯一实例。这个类可以保证没有其他实例可以被创建（私有构造器方法），并且它可以提供一个访问该实例的方法。

```java
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
```

### 多线程时的单例安全

　　问题：多线程同时访问Singleton类，调用getInstance()方法，可能造成创建多个实例。

　　简单粗暴解决：直接加锁锁住getInstance()方法，不考虑性能

```java
//单例模式第二版，粗暴线程安全
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    //加synchronized 关键字
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### 懒汉模式：双重锁定

```java
//单例模式第三版，懒汉模式
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        //双重锁定
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

　　为什么要双重判空？

　　对于 Instance存在的情况，就直接返回，这没有问题。当 Instance为null,并且同时有两个线程调用Getinstance()方法时，它们都可以通过第一重instance＝null的判断。然后由于锁机制，这两个线程则只有一个进入，另一个在外排队等候，必须要其中的一个进入并出来后，另一个才能进入。而此时如果没有了第二重的 Instance是否为nul的判断，则第一个线程创建了实例，而第二个线程还是可以继续再创建新的实例，这就没有达到单例的目的。

### 饿汉模式

```java
//单例模式第三版，饿汉模式
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
```

　　为什么叫懒汉模式，饿汉模式？

　　由于这种静态初始化的方式是在自己被加載时就将自己实例化，所以被形象地称之为饿汉式单例类。懒汉模式的处理方式是要在第一次被引用时，才会将自己实例化，所以就被称为懒汉式单例类。

　　懒汉模式，饿汉模式的区别？

　　由于饿汉式，即静态初始化的方式，它是类一加载就实例化的对象，所以要提前占用系统资源。然而懒汉式，又会面临着多线程访问的安全性问题，需要做双重锁定这样的处理才可以保证安全。所以到底使用哪一种方式，取决于实际的需求。