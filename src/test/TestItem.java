package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Item;
import test.mockedObjects.MockItem;

class TestItem {

	@Test
	@DisplayName("Test constructor is not null")
	void testNotNullConstructor() {
		Item item = new Item("");
		assertNotNull(item);
	}

	@Test
	@DisplayName("Test setId Method")

	void testSetIdMethod() {
		Item item = new Item("");
		item.setId("abc");
		assertEquals("abc", item.toString());
	}

	@Test
	@DisplayName("Test toString method")

	void testToStringMethodReturnsCorrectly() {
		Item item = new Item("abc");
		assertEquals("abc", item.toString());
	}

	@Test
	@DisplayName("Test constructor saves lowercase id correctly")

	void testConstructorSetsLowercaseCorrectly() {
		MockItem item = new MockItem("abc");
		assertEquals("abc", item.getId());
	}

	@Test
	@DisplayName("Test constructor sets numeric id correctly")

	void testConstructorSetsNumericIdCorrectly() {
		MockItem item = new MockItem("123");
		assertEquals("123", item.getId());
	}

	@Test
	@DisplayName("Test constructor is converting upper case to lower case")

	void testConstructorConvertsUpperCaseToLowerCase() {
		MockItem item = new MockItem("ABC");
		assertEquals("abc", item.getId());
	}

	@Test
	@DisplayName("Test constructor throws when id is null")

	void testThrowsIfConstructorThrowsWhenIdIsNull() {

		assertThrows(NullPointerException.class, () -> {
			new MockItem(null);
		});
	}

	@Test
	@DisplayName("Test constructor with empty string id is empty")

	void testEmptyStringIdIsCorrect() {
		MockItem item = new MockItem("");
		assertEquals("", item.getId());
	}

}
