package com.example.datastructure;

/**
 * 栈的接口类
 * @param <T>
 */
public interface CustomStack<T> {

    //压栈方法
    public void push(T data ) throws  Exception;
    //弹栈方法/移除顶部元素,并返回对应的数据
    public T pop() throws  Exception;
    //获取stack第一个元素
    public T peek();
    //判断是否为空
    public boolean empty();
    //返回栈中元素个数
    public int size();

}
