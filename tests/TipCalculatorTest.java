import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipCalculatorTest {

    @org.junit.jupiter.api.Test
    void TipCalculatorTest1() {
        TipCalculator test = new TipCalculator();
        assertEquals(20,test.calculateTip(100,20));
    }
    @org.junit.jupiter.api.Test
    void TipCalculatorTest2() {
        TipCalculator test = new TipCalculator();
        assertEquals(500,test.calculateTip(1000,50));
    }
}
