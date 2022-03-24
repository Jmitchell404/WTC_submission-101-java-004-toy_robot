package za.co.wethinkcode.toyrobot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

    @Test
    void testDefaultDirection(){
        assertEquals("NORTH", Direction.NORTH.name());
    }

    @Test
    void testDirectionEquals(){
        assert(Direction.NORTH.equals(Direction.NORTH));

    }
}
