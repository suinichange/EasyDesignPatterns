## 代码无错就是优？——简单工厂模式

### 本章概述

　　本章主要通过一个面试小例子，实现一个简单计算器，讲解面向对象编程的好处。并通过一个业务不断变化的过程，渐渐显现出一份可复用，封装性强，松耦合的代码的优势和重要性。[(java实现代码)](https://github.com/suinichange/EasyDesignPatterns/tree/master/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/Calculator/src)

　　并巧妙的引入了简单工厂模式，在开发中交由一个工厂类去确定我们要实例化的对象，将来是否要新增对象。就如同生活中，由工厂来生产商品，而不是我们自己亲手去制造要的东西。这在生活中给我们带来了诸多便利，在编程中亦是如此。[(工厂类代码)](https://github.com/suinichange/EasyDesignPatterns/blob/master/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/Calculator/src/businessLogic/factory/OperationFactory.java)

　　本章的最后则是讲解了 UML 类图的基础知识，类、接口的图例表示，类与类，类与接口之间的关系：继承，实现，聚合，依赖。让我们能更深入的了解面向对象的思想，写出优雅的代码。

　　记住，编程不仅是一门技术，更是一门艺术。