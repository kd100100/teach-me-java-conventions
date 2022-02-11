package powerpackage;

import org.junit.Test;

public class PowerTest {

    @Test
    public void oneRaisedToOneIsOne() {
        assert PowerFinder.calculate(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert PowerFinder.calculate(2,1) == 2;
    }

    @Test
    public void twoPowerTwoIsFour() {
        assert PowerFinder.calculate(2, 2) == 4;
    }

    @Test
    public void powerOfTwoAndThreeIsSix() {
        assert PowerFinder.calculate(3, 2) == 9;
    }
}




