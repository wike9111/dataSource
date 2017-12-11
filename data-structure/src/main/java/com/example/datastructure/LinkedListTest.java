package com.example.datastructure;

public class LinkedListTest {

    public static void main(String[] args){

        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.add("I");
        linkedList.add("am");
        linkedList.add("Andy");
        System.out.println("是否为空："+linkedList.isEmpty());
        System.out.println("am是否存在："+linkedList.isExist("am"));
        System.out.println("索引为0的元素："+(String)linkedList.get(0));
        System.out.println("链表长度："+linkedList.size());
        System.out.print("链表所有元素为：");
        linkedList.print();
        System.out.println();
        //删除I元素
        linkedList.remove("I");
        System.out.print("删除后链表所有元素为：");
        linkedList.print();
    }
}
