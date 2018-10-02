## 代理模式

### 概念

　　代理模式为其他对象提供代理（一个替身或者占位符）以控制对这个对象的访问。

### 代理模式结构图

　　![代理模式结构图](https://github.com/suinichange/EasyDesignPatterns/blob/master/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F%E7%BB%93%E6%9E%84%E5%9B%BE.jpg)

　　首先，Proxy和RealSubject都实现了接口，这允许用户都可以像处理RealSubject对象一样地Proxy处理对象。

　　RealSubject通常是真正做事的对象，由Proxy对它进行访问控制。

　　Proxy持有RealSubject引用，使得代理可以访问到真正的实体。在某些例子中，Proxy还会负责 Realsubject对象的创建与销毁。**客户和Realsubject的交互都必须通过 Proxy**。因为Proxy和Realsubject实现相同的接口（Subject），所以任何用到 Realsubject的地方，都可以用 Proxy取代。

　　本章案例代码：[代理追求女孩子](https://github.com/suinichange/EasyDesignPatterns/tree/master/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F/ProxyPattern/src/com)

### 代理模式的应用

　　**远程代理**，也就是为了一个对象在不同的地址空间提供局部代表，这样可以隐藏一个对象存在于不同地址空间的事实，就像web service里的Web Reference 一样，客户端就可以通过调用代理解决远程访问的问题。

　　**虚拟代理**，根据需要创建开销很大的对象，通过它来存放实例化需要很长时间的真实对象。当对象在创建前和创建中时，由虚拟代理来扮演对象的替身。对象创建后，代理就会将请求直接委托给对象。比如：网页加载时，由于图片太大，在加载未完成时用代理图片替代。显示一张“图片正在加载...”的图片，当图片真正加载完成时，再显示真正的图片。[（菜鸟教程——虚拟代理图片实现）](http://www.runoob.com/design-pattern/proxy-pattern.html)

　　**安全代理**，用来控制真实对象访问时的权限，一般用于对象应该有不同的访问权限。

　　**智能指引**，是指当调用真实的对象时，代理处理另外一些事情。比如计算真实对象的引用计数，当该对象没有引用时，可以自动释放它（GC）。或者访问一个实际对象时，检查是否已经能够锁定它，以确保其他对象不能改变它（监视器）。
