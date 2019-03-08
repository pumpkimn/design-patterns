package  com.example.learndesignpatterns.creationalpatterns.prototype;

/**
 * @description: 声明接口来复制它自己。
 * @author: lee
 * @create: 2019/03/08 13:28
 */
public abstract class Prototype {
    /**
     *  复制的方法。
     * @return 对象的拷贝
     * @throws CloneNotSupportedException
     */
    abstract Prototype copyMe() throws CloneNotSupportedException;

}
