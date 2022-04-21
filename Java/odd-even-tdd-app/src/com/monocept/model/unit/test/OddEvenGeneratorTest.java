package com.monocept.model.unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.customException.NegativeValueNotAllowed;
import com.monocept.model.OddEvenGenerator;

class OddEvenGeneratorTest {

	@Test
	void getOddNosTillMethodNotReturnNull() throws NegativeValueNotAllowed {
		OddEvenGenerator generator = new OddEvenGenerator();
		int result[] = generator.getOddNosTill(10);
		assertNotNull(result);
	}

	@Test
	void getEvenTillShouldGenerate5EvenNosForInput10() {
		int expectedEvenNos[] = { 2, 4, 6, 8, 10 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] evnos = generator.getEvenNosTill(10);
		assertTrue(evnos.length == expectedEvenNos.length);
	}

	@Test
	void getEvenTillShouldGenerate5EvenNosForInput11()  {
		int expectedEvenNos[] = { 2, 4, 6, 8, 10 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] evnos = generator.getEvenNosTill(11);
		assertTrue(evnos.length == expectedEvenNos.length);
	}

	@Test
	void getOddTillShouldGenerate5OddNosForInput10() {
		int expectedEvenNos[] = { 1, 3, 5, 7, 9 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] evnos = generator.getOddNosTill(10);
		assertTrue(evnos.length == expectedEvenNos.length);
	}

	@Test
	void getOddTillShouldGenerate6OddNosForInput11()  {
		int expectedEvenNos[] = { 1, 3, 5, 7, 9, 11 };
		OddEvenGenerator generator = new OddEvenGenerator();
		int[] evnos = generator.getOddNosTill(11);
		assertTrue(evnos.length == expectedEvenNos.length);
	}

	@Test
	void shouldThrowNegativeValueNotAllowed() {
		OddEvenGenerator generator = new OddEvenGenerator();
		assertThrows(NegativeValueNotAllowed.class, () -> generator.getOddNosTill(-11), "Failed");
	}
}
