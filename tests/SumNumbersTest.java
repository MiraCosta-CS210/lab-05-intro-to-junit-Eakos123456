import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumNumbersTest {

    @org.junit.jupiter.api.Test
    void sumIsEven() {
        SumNumbers test = new SumNumbers();
        assertEquals(1,test.sumIsEven(1,1));
    }

    @org.junit.jupiter.api.Test
    void sumIsOdd() {
        SumNumbers test = new SumNumbers();
        assertEquals(0,test.sumIsEven(1,2));
    }
}
