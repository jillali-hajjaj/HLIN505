package TD6.Exo1;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

import static org.hamcrest.MatcherAssert.*;



public class TestFooBar {
	SUT sut;

	@BeforeEach
	public void setUp() throws Exception {
		sut=new SUT();
	}

	@Test
	public void testLouche(){
		assertEquals(1,2); // s'arrete à la première erreur, il ne continue pas
		assertTrue(false);
	}
	
	@Test
	public void testFooInitParDefaut1() {
		assertTrue(sut.foo(0)==1);
		assertTrue(sut.foo(2)==3);
		assertTrue(sut.foo(4)==3);
		assertTrue(sut.foo(6)==5);
	}

	@Test
	public void testFooInitParDefaut3() {
		assertEquals(1,sut.foo(0));
		assertEquals(3, sut.foo(2));
		assertEquals(3, sut.foo(4));
		assertEquals(5, sut.foo(6));
	}

	
	@Test
	public void testFooInitParDefaut2() {
		assertEquals(sut.foo(0),1);
		assertEquals(sut.foo(2),3);
		assertEquals(sut.foo(4),3);
		assertEquals(sut.foo(6),5);
	}
	@Test
	public void testFooInitParDefaut4() {
		assertThat(sut.foo(0),is(1));
		assertThat(sut.foo(2),is(3));
		assertThat(sut.foo(4),is(3));
		assertThat(sut.foo(6),is(5));

	}
	
	@Test
	public void testBar(){
		sut.bar();
	}

}
