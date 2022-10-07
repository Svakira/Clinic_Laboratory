package model;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.Optional;

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
    public void testEliminateNode(){
        setUpStage2();
        Integer expected= 2;
        queueT.delete(expected);
        assertNull(queueT.getHead());
    }

    @Test
    public void testSearch(){
        setUpStage3();
        Integer expected= 2;
        queueT.search(expected);
        assertEquals(expected,queueT.getHead().getValue());
    }

}
