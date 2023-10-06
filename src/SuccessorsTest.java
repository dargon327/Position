import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuccessorsTest {

    private int[][] array2d;

    @BeforeEach
    void setUp() {

        array2d = new int[][]{
                {15, 5, 9, 10},
                {12, 16, 11, 6},
                {14, 8, 13, 7}
        };

    }

    @AfterEach
    void tearDown() {

        array2d = null;

    }

    @Test
    void findPosition() {

        assertEquals(2, Successors.findPosition(8, array2d).getR());
        assertEquals(1, Successors.findPosition(8, array2d).getC());

        assertEquals(null, Successors.findPosition(17, array2d));

        assertEquals(0, Successors.findPosition(15, array2d).getR());
        assertEquals(0, Successors.findPosition(15, array2d).getC());

        assertEquals(0, Successors.findPosition(5, array2d).getR());
        assertEquals(1, Successors.findPosition(5, array2d).getC());

        assertEquals(0, Successors.findPosition(9, array2d).getR());
        assertEquals(2, Successors.findPosition(9, array2d).getC());

        assertEquals(0, Successors.findPosition(10, array2d).getR());
        assertEquals(3, Successors.findPosition(10, array2d).getC());

        assertEquals(1, Successors.findPosition(12, array2d).getR());
        assertEquals(0, Successors.findPosition(12, array2d).getC());

        assertEquals(1, Successors.findPosition(16, array2d).getR());
        assertEquals(1, Successors.findPosition(16, array2d).getC());

        assertEquals(1, Successors.findPosition(11, array2d).getR());
        assertEquals(2, Successors.findPosition(11, array2d).getC());

        assertEquals(1, Successors.findPosition(6, array2d).getR());
        assertEquals(3, Successors.findPosition(6, array2d).getC());

        assertEquals(2, Successors.findPosition(14, array2d).getR());
        assertEquals(0, Successors.findPosition(14, array2d).getC());

        assertEquals(2, Successors.findPosition(8, array2d).getR());
        assertEquals(1, Successors.findPosition(8, array2d).getC());

        assertEquals(2, Successors.findPosition(13, array2d).getR());
        assertEquals(2, Successors.findPosition(13, array2d).getC());

        assertEquals(2, Successors.findPosition(7, array2d).getR());
        assertEquals(3, Successors.findPosition(7, array2d).getC());

    }

    @Test
    void getSuccessorArray() {

        assertEquals(1, Successors.getSuccessorArray(array2d)[0][0].getR());
        assertEquals(1, Successors.getSuccessorArray(array2d)[0][0].getC());

        assertEquals(1, Successors.getSuccessorArray(array2d)[0][1].getR());
        assertEquals(3, Successors.getSuccessorArray(array2d)[0][1].getC());

        assertEquals(0, Successors.getSuccessorArray(array2d)[0][2].getR());
        assertEquals(3, Successors.getSuccessorArray(array2d)[0][2].getC());

        assertEquals(1, Successors.getSuccessorArray(array2d)[0][3].getR());
        assertEquals(2, Successors.getSuccessorArray(array2d)[0][3].getC());

        assertEquals(2, Successors.getSuccessorArray(array2d)[1][0].getR());
        assertEquals(2, Successors.getSuccessorArray(array2d)[1][0].getC());

        assertEquals(null, Successors.getSuccessorArray(array2d)[1][1]);
        assertEquals(null, Successors.getSuccessorArray(array2d)[1][1]);

        assertEquals(1, Successors.getSuccessorArray(array2d)[1][2].getR());
        assertEquals(0, Successors.getSuccessorArray(array2d)[1][2].getC());

        assertEquals(2, Successors.getSuccessorArray(array2d)[1][3].getR());
        assertEquals(3, Successors.getSuccessorArray(array2d)[1][3].getC());

        assertEquals(0, Successors.getSuccessorArray(array2d)[2][0].getR());
        assertEquals(0, Successors.getSuccessorArray(array2d)[2][0].getC());

        assertEquals(0, Successors.getSuccessorArray(array2d)[2][1].getR());
        assertEquals(2, Successors.getSuccessorArray(array2d)[2][1].getC());

        assertEquals(2, Successors.getSuccessorArray(array2d)[2][2].getR());
        assertEquals(0, Successors.getSuccessorArray(array2d)[2][2].getC());

        assertEquals(2, Successors.getSuccessorArray(array2d)[2][3].getR());
        assertEquals(1, Successors.getSuccessorArray(array2d)[2][3].getC());


    }
}