
package model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

class QueueTest {
    /*private QueueT<String> queueT;

    public void setUpStage1() {
        queueT = new QueueT();
    }
    private void setUpStage2(){
        queueT=new QueueT<>();
        queueT.insert("Rasta", "17");
        queueT.insert("Sara", "9");
        queueT.insert("David", "3");
        queueT.insert("Patiño", "40");
    }


    public void setUpStage3() {
        queueT = new QueueT();
        queueT.insert("Sara","2");
        queueT.insert("Juan Diego","3");
        queueT.insert("David Vergara","4");
        queueT.insert("Laura","5");
        queueT.insert("Mariana","6");
        Patient patient=new Patient("sara","17","123","FEM","12345",2,2,2);
    }

    @Test
    public void testInsertNode() {
        setUpStage1();
        String expected = "Rosebud";
        queueT.insert(expected,"12");
        assertEquals(expected, queueT.getHead().getValue());
    }

    @Test
    public void testInsert2Nodes(){
        setUpStage1();
        String expected="Alfredo";
        String expected2="4";
        String expected3="Lora";
        String expected4="10";
        queueT.insert(expected,expected2);
        queueT.insert(expected3,expected4);
        assertEquals(expected, queueT.getHead().getValue());
        assertEquals(expected2, queueT.search(expected3));

    }
    @Test
    public void testInsert3Nodes(){
        setUpStage1();
        String expected="Lorena";
        String expected2="14";
        String expected3="Yudy";
        String expected4="16";
        String expected5="Juli";
        String expected6="20";
        queueT.insert(expected,expected2);
        queueT.insert(expected3,expected4);
        queueT.insert(expected5,expected6);
        assertEquals(expected, queueT.getHead().getValue());
        assertEquals(expected2, queueT.search(expected2).getValue());
        assertEquals(expected3, queueT.search("5").getValue());

    }

    @Test
    public void testEliminateNode(){
        setUpStage3();
        Patient patient=new Patient("sara","17","123","FEM","12345",2,2,2);
        queueT.deleteFromQueue(patient);
        assertNull(queueT.search("123"));
    }
    @Test
    public void testEliminate2Nodes(){
        setUpStage3();
        Patient patient=new Patient("sara","17","123","FEM","12345",2,2,2);
        Patient patient1=new Patient("jimmy","17","1234","FEM","12345",2,2,2);
        Patient patient2=new Patient("fer","17","12345","FEM","12345",2,2,2);

        queueT.deleteFromQueue(patient);
        queueT.deleteFromQueue(patient1);
        assertNull(queueT.search("12345"));
        assertNull(queueT.search("1234"));
    }

    @Test
    public void eliminateThenInsertTest() {
        setUpStage1();
        queueT.insert(2);
        queueT.delete(2);
        Integer expected = 2;
        assertNull(queueT.getHead());
        queueT.insert(3);
        queueT.delete(3);
        Integer expected2 = 3;
        assertNull(queueT.getHead());
    }



    @Test
    public void testSearch(){
        setUpStage3();
        Integer expected= 2;
        queueT.search(expected);
        assertEquals(expected,queueT.getHead().getValue());
    }

    @Test
    public void searchNull(){
        setUpStage3();
        Integer expected=5;
        queueT.delete(5);
        assertNull(queueT.search(5));
    }

    @Test
    public void searchNulls(){
        setUpStage3();
        queueT.deleteFromQueue();
        queueT.delete(3);
        queueT.delete(4);
        queueT.delete(2);
        assertNull(queueT.search(5));
        assertNull(queueT.search(3));
        assertNull(queueT.search(4));
        assertNull(queueT.search(2));
    }
    @Test
    public void maxHeapifyPrint(){
        setUpStage3();
        queueT.maxHeapify(2);
        assertEquals("9 7 4 5 2 3 ",queueT.print());
    }
    @Test
    public void maxHeapifyTest2(){
        setUpStage2();
        queueT.maxHeapify(1);
        assertEquals("9 7 4 5 2 3 ",queueT.print());
    }
    @Test
    public void maxHeapifyTest3(){
        setUpStage2();
        queueT.maxHeapify(3);
        assertEquals("9 7 4 5 2 3 ",queueT.print());
    }*/

}