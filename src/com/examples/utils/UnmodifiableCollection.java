package com.examples.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
 
public class UnmodifiableCollection {
 
  public static void main(String args[]) {

    /*

Please note that the same API applies to any type of 

Collection implementation classes e.g. 

HashSet, TreeSet, LinkedHashSet, LinkedList etc

Nevertheless Java util API provides separate methods for getting 

immutable Collection views based on the following Collection 

implementation classes :

- static Collection unmodifiableCollection(Collection)

- static List unmodifiableList(List)

- static Set unmodifiableSet(Set)

- static SortedSet unmodifiableSortedSet(SortedSet)

- static Map unmodifiableMap(Map)

- static SortedMap unmodifiableSortedMap(SortedMap)

It is highly suggested to use one of the above depending on your 

source Collection implementation class
     */

    // Create an ArrayList and populate it with elements
    List list = new ArrayList();
    list.add("element_1");
    list.add("element_2");
    list.add("element_3");
 
    // static unmodifiableCollection(collection) method returns an immutable Collection from the provided ArrayList
    Collection unmodifiableCollection = Collections.unmodifiableCollection(list);
 
    System.out.println("unmodifiableCollection contains : " + unmodifiableCollection);
    //Adding to an unmodifiable collection will throw UnsupportedException
    unmodifiableCollection.add("Element_4");
  }
}
