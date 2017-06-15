package com;

import java.util.ArrayList;
import java.util.List;
 
public class Prove
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 3000; i++)
        {
            Prove p = new Prove();
            if (!list.contains(p.hashCode())){
            	list.add(p.hashCode());
            }else{
            	System.out.println(p.hashCode());
            }
        }
        System.out.println(list.size());
    }
}