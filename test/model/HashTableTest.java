package model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HashTableTest{
    HashTable<String, String>hashTable;
   /* public void setUpStage1() {
        hashTable = new HashTable<>(10);
    }
    @Test
    public void insertOneElementTest(){
        setUpStage1();
        hashTable.insert("2","4");
        String expected="2";
        assertEquals(expected,hashTable.search("2").getValue());
    }
    @Test
    public void insertTwoElementsTest(){
        setUpStage1();
        hashTable.insert("3","6");
        String expected="3";
        assertEquals(expected,hashTable.search("3").getValue());
        hashTable.insert("1","9");
        String expected2="1";
        assertEquals(expected2,hashTable.search(expected2).getValue());
    }

    @Test
    public void insertThreeElementsTest(){
        setUpStage1();
        hashTable.insert("3","6");
        Integer expected=3;
        assertEquals(expected,hashTable.search("3").getValue());
        hashTable.insert("1","9");
        Integer expected2=1;
        assertEquals(expected2,hashTable.search("1").getValue());
        hashTable.insert("5","8");
        Integer expected3=5;
        assertEquals(expected3,hashTable.search("5").getValue() );
    }
    @Test
    public void eliminateOneElementTest(){
        setUpStage1();
        hashTable.insert("4","1");
        int k=hashTable.getHashIndex("4");
        hashTable.eliminate("4");
        assertNull(hashTable.search(String.valueOf(k)));
    }
    @Test
    public void eliminateTwoElementTest(){
        setUpStage1();
        hashTable.insert("4","1");
        hashTable.insert("5","6");
        int k=hashTable.getHashIndex("4");
        int o=hashTable.getHashIndex("5");
        hashTable.eliminate("4");
        hashTable.eliminate("5");
        assertNull(hashTable.search("k"));
        assertNull(hashTable.search("o"));
    }
    @Test
    public void eliminateNull(){
        setUpStage1();
        boolean flag=true;
        String expected="4";
        hashTable.insert("4","1");
        //map.insert(5,6);
        int k=hashTable.getHashIndex("4");
        //int o=map.getHashIndex(5);
        hashTable.eliminate("4");
        //map.eliminate(5);
        assertNull(hashTable.search(String.valueOf(k)));
        //assertNull(map.search(o));
        try{
            hashTable.eliminate("4");
        }catch (NullPointerException e){
            flag=true;
        }

        assertTrue(flag);
    }

    @Test
    public void searchHashTest(){
        setUpStage1();
        hashTable.insert("2","3");
        hashTable.search("2");
        String expected="2";
        Integer k= hashTable.getHashIndex("2");
        assertEquals(expected,k);
    }

    @Test
    public void search2HashTest(){
        setUpStage1();
        hashTable.insert("1","2");
        hashTable.insert("3","4");
        hashTable.insert("5","6");
        hashTable.insert("7","8");
        String expected="3";
        String expected2="5";
        String expected3="7";
        Integer a= hashTable.getHashIndex("3");
        Integer b= hashTable.getHashIndex("5");
        Integer c= hashTable.getHashIndex("7");
        assertEquals(expected,a);
        assertEquals(expected2,b);
        assertEquals(expected3,c);


    }

    @Test
    public void searchNull(){
        setUpStage1();
        hashTable.insert("1","2");
        hashTable.insert("3","4");
        Integer k= hashTable.getHashIndex("1");
        hashTable.eliminate("1");
        assertNull(hashTable.search(String.valueOf(k)));
    }*/
}
