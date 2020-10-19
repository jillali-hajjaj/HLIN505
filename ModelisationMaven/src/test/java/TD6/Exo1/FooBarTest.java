package TD6.Exo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooBarTest {
    SUT sut;

    @BeforeEach
    public void setUp() throws Exception {
        sut=new SUT(-1,2,3);
    }

    @Test
    public void testFooBar() throws FooBarException {
        assertThrows(FooBarException.class, () -> sut.foobar());
       }

}