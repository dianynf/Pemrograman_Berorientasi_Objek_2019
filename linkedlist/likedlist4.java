package com.linkedlist;

import java.util.LinkedList;

public class likedlist4 {
    public static void main(String []args){
        LinkedList<String> staff = new LinkedList<String>();
        staff.addFirst("herry");
        staff.addFirst("diana");
        staff.addFirst("tom");
        System.out.println(staff.removeFirst());
        System.out.println(staff.removeFirst());
        System.out.println(staff.removeFirst());
    }
}
