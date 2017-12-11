package com.example.datastructure;

/***
 * 自定义的队列接口，定义队列需要实现的方法，提供给类继承实现
 * @param <T>
 */
public interface CustomQueue < T > {

    //入队函数,实现队列添加元素
    public void put(T data ) throws  Exception;

    //出队函数,实现队列元素删除
    public T  remove() throws Exception;

    //判断是否队列为空
    public boolean isEmpty();
    //获取队列的长度
    public int size();
    //获取队列头元素
    public T getFrontElement() throws  Exception;

}
