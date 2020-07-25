package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitTest {
    Junit obj1 = new Junit();
    @Test
    void add() {



        assertEquals(5.0,obj1.add(3.0, 2.0));


    }


    @Test
    void biggest() {

        assertEquals(5.0, obj1.biggest(3.0,5.0));
    }
}