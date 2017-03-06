package doubler.impl;

import doubler.Doubler;
import org.junit.Test;

public class DoublerImplTest {
    
    @Test
    public void testIt() {
        Doubler doubler = new DoublerImpl();
        assert doubler.doubleIt(2) == 4;
    }
    //test on cutmethoid
    @Test
    public void testCut() {
        Doubler doubler = new DoublerImpl();
        assert doubler.cutIt(2) == 1;
    }
}
