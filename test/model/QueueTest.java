package model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

class QueueTest {
    private QueueT<Integer> queueT;

    public void setUpStage1() {
        queueT = new QueueT();
    }

    public void setUpStage2() {
        queueT = new QueueT();
        queueT.insert(2);
    }
    public void setUpStage3() {
        queueT = new QueueT();
        queueT.insert(2);
        queueT.insert(3);
        queueT.insert(4);
        queueT.insert(5);
        queueT.insert(6);
    }




    @Test
    public void testInsertNode() {
        setUpStage1();
        Integer expected = 2;
        queueT.insert(expected);
        assertEquals(expected, queueT.getHead().getValue());
    }

    @Test
    public void testInsert2Nodes(){
        setUpStage1();
        Integer expected=3;
        Integer expected2=4;
        queueT.insert(3);
        queueT.insert(4);
        assertEquals(expected, queueT.getHead().getValue());
        assertEquals(expected2, queueT.search(4).getValue());

    }
    @Test
    public void testInsert3Nodes(){
        setUpStage1();
        Integer expected=3;
        Integer expected2=4;
        Integer expected3=5;
        queueT.insert(3);
        queueT.insert(4);
        queueT.insert(5);
        assertEquals(expected, queueT.getHead().getValue());
        assertEquals(expected2, queueT.search(4).getValue());
        assertEquals(expected3, queueT.search(5).getValue());

    }

    @Test
    public void testEliminateNode(){
        setUpStage2();
        Integer expected= 2;
        queueT.delete(expected);
        assertNull(queueT.getHead());
    }
    @Test
    public void testEliminate2Nodes(){
        setUpStage2();
        queueT.insert(3);
        Integer expected= 2;
        Integer expected2=3;
        queueT.delete(expected);
        queueT.delete(expected2);
        assertNull(queueT.getHead());
        assertNull(queueT.search(expected2));
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
        Integer expected=5;
        Integer expected2=3;
        Integer expected3=4;
        Integer expected4=2;
        queueT.delete(5);
        queueT.delete(3);
        queueT.delete(4);
        queueT.delete(2);
        assertNull(queueT.search(5));
        assertNull(queueT.search(3));
        assertNull(queueT.search(4));
        assertNull(queueT.search(2));
    }

}
