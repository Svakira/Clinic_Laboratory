package model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HashTableTest {

    private HashTable<Integer, Integer> map;

    public void setUpStage1(){
        map = new HashTable<>(10);


    }

    @Test
    public void insertOneElementTest(){
        setUpStage1();
        map.insert(2,4);
        Integer expected=2;
        assertEquals(expected,map.search(2).getValue().getKey());
    }
    @Test
    public void insertTwoElementsTest(){
        setUpStage1();
        map.insert(3,6);
        Integer expected=3;
        assertEquals(expected,map.search(3).getValue().getKey());
        map.insert(1,9);
        Integer expected2=1;
        assertEquals(expected2,map.search(expected2).getValue().getKey());
    }

    @Test
    public void insertThreeElementsTest(){
        setUpStage1();
        map.insert(3,6);
        Integer expected=3;
        assertEquals(expected,map.search(3).getValue().getKey());
        map.insert(1,9);
        Integer expected2=1;
        assertEquals(expected2,map.search(1).getValue().getKey());
        map.insert(5,8);
        Integer expected3=5;
        assertEquals(expected3,map.search(5).getValue().getKey());
    }
    @Test
    public void eliminateOneElementTest(){
        setUpStage1();
        map.insert(4,1);
        int k=map.getHashIndex(4);
        map.eliminate(4);
        assertNull(map.search(k));
    }
    @Test
    public void eliminateTwoElementTest(){
        setUpStage1();
        map.insert(4,1);
        map.insert(5,6);
        int k=map.getHashIndex(4);
        int o=map.getHashIndex(5);
        map.eliminate(4);
        map.eliminate(5);
        assertNull(map.search(k));
        assertNull(map.search(o));
    }
    @Test
    public void eliminateNull(){
        setUpStage1();
        boolean flag=true;
        Integer expected=4;
        map.insert(4,1);
        //map.insert(5,6);
        int k=map.getHashIndex(4);
        //int o=map.getHashIndex(5);
        map.eliminate(4);
        //map.eliminate(5);
        assertNull(map.search(k));
        //assertNull(map.search(o));
        try{
            map.eliminate(4);
        }catch (NullPointerException e){
            flag=true;
        }

        assertTrue(flag);
    }

    @Test
    public void searchHashTest(){
        setUpStage1();
        map.insert(2,3);
        map.search(2);
        Integer expected=2;
        Integer k= map.getHashIndex(2);
        assertEquals(expected,k);
    }

    @Test
    public void search2HashTest(){
        setUpStage1();
        map.insert(1,2);
        map.insert(3,4);
        map.insert(5,6);
        map.insert(7,8);
        Integer expected=3;
        Integer expected2=5;
        Integer expected3=7;
        Integer a= map.getHashIndex(3);
        Integer b= map.getHashIndex(5);
        Integer c= map.getHashIndex(7);
        assertEquals(expected,a);
        assertEquals(expected2,b);
        assertEquals(expected3,c);


    }

    @Test
    public void searchNull(){
        setUpStage1();
        map.insert(1,2);
        map.insert(3,4);
        Integer k= map.getHashIndex(1);
        map.eliminate(1);
        assertNull(map.search(k));
    }

}
