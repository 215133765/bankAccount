/**
 * Mziyanda Mwanda
 * 215133765
 * ADP 3
 * Assignment 2
 * 16 May 2021
 * **/
package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class savingsAccountTest {
    Collection colSavA = new LinkedHashSet();
    Map<Integer, savingsAccount> mapSavA = new HashMap<>();
    Set<savingsAccount> setSavA = new HashSet<>();
    List<savingsAccount> listSavA = new ArrayList<>();

    @Test
    void testCollection(){

        //COllectionAdd
        colSavA.add(new savingsAccount(1, "Chris"));
        colSavA.add(new savingsAccount(2, "Xolisa"));
        colSavA.add(new savingsAccount(3, "Coetz"));
        colSavA.add(new savingsAccount(4, "Anele"));
        colSavA.add(new savingsAccount(5, "Smidtz"));

        System.out.println("The 5 element of the list have been successfully added");
        assertEquals(5, colSavA.size());

        //CollectionRemove
        colSavA.remove(new savingsAccount(4,"Anele"));
        System.out.println("One of the elements in the list was successfully removed");
        assertEquals(4, colSavA.size());

        //CollectionFinds
        boolean find = colSavA.contains(new savingsAccount(3, "Coetz"));
        System.out.println("The element in index 3 was found");
        assertEquals(4,colSavA.size());

    }

    @Test
    void testMap(){
        for (int i = 0; i < 5; i++) {
            String name = "Smith" + 1;
            savingsAccount sA = new savingsAccount(i, name);
            mapSavA.put(i, sA);
        }
        //MapAdd
        assertEquals(5, mapSavA.size());
        System.out.println("The elements were successfully added in the map");

        //MapRemove
        savingsAccount element = mapSavA.remove(1);
        System.out.println("One element in the map was removed");
        assertEquals(4, mapSavA.size());

        //MapFind
        boolean hash = mapSavA.containsKey(2);
        System.out.println("Element with k 2 was found");
        assertEquals(4, mapSavA.size());
    }

    @Test
    void testSet(){
        for (int i = 0; i < 5; i++) {
            String name = "John";
            savingsAccount sA = new savingsAccount(i, name);
            setSavA.add(sA);
        }
        //SetAdd
        assertEquals(5, setSavA.size());
        //SetRemove
        setSavA.clear();

        if (setSavA.isEmpty()) {
            System.out.println("The set is empty");
        }
        assertEquals(0, setSavA.size());
        //ListFind*/
        boolean contain ;
        if (contain = setSavA.contains(1)){
            System.out.println("The value was found");
        }else{
            System.out.println("We did not find the value");
        }

        assertEquals(0, setSavA.size());


    }

    @Test
    void testList() {
        //ListAdd
        listSavA.add(new savingsAccount(1, "Smith"));
        listSavA.add(new savingsAccount(2, "Lotz"));
        listSavA.add(new savingsAccount(3, "Coetz"));
        listSavA.add(new savingsAccount(4, "Anele"));

        System.out.println("The 4 element of the list have been successfully added");
        assertEquals(4, listSavA.size());

        //ListRemove
        listSavA.remove(1);
        System.out.println("One of the elements in the list was successfully removed");
        assertEquals(3, listSavA.size());

        //ListFinds
        boolean find = listSavA.contains(new savingsAccount(2, "Lotz"));
        System.out.println("The element in index 2 was found");
        assertEquals(3,listSavA.size());


    }




}