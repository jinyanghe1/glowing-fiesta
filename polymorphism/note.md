**类转型**

- 变量支持互相转换
- 类型可以相互转型，只限于有继承关系的类
  - 子类可以转父类，父类不能转子类，除非父类是通过子类转化：

  ```java
  Human obj1 = new Human()//ok, Man extends Human
  Man obj2 = new Human()//ok, obj1 born from Man class
  ```

  - **多态**：
    - 子类可以重写父类的方法
  