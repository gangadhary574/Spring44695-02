/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author AJAY
 */
public class LinkedListDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> groceries = new LinkedList<>();
        groceries.add("Leaves");
        System.out.println(groceries.add("Milk"));
        groceries.add("Eggs");
        System.out.println(groceries);
        System.out.println("Removed: "+groceries.remove());
        
        for(String grocery: groceries ){
            System.out.println(grocery);
        }
        System.out.println("*************");
        
       Iterator<String> g = groceries.iterator();       
       while(g.hasNext()){
           System.out.println(g.next());
       }
       System.out.println("**************");
       
        ListIterator<String> listItrG = groceries.listIterator();
        
        while(listItrG.hasPrevious()){
            System.out.println(listItrG.previous());
        }
        
        System.out.println("******************");
        
    }
    
}
