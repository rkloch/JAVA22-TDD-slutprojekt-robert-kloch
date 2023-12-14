package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import main.Buffer;
import main.Item;
import test.mockedObjects.MockBuffer;
import test.mockedObjects.MockConsumer;
import test.mockedObjects.MockItem;
import test.mockedObjects.MockProducer;

class TestBuffer {
	MockBuffer buffer;

	@BeforeEach
	void setupBuffer() {
		buffer = new MockBuffer();
	}

	@Test
	@DisplayName("Test adding a item and one is in buffer")

	void testAddingOneItemTOBuffer() {
		buffer.add(new Item(""));
		assertEquals(1, buffer.getBufferSize());
	}

	@Test
	@DisplayName("Test if exception stacktrace is printed")

	void testExceptionInBufferRemovalIsWorking() {
		buffer.add(new Item(""));
		buffer.remove();

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				buffer.remove();

			}

		});
		thread.start();

		thread.interrupt();

		assertTrue(thread.isInterrupted());

	}

	@Test
	@DisplayName("Test adding item to buffer and one item is removed")

	void testAddingOneItemToBuffer() {
		buffer.add(new Item(""));
		buffer.remove();
		assertEquals(0, buffer.getBufferSize());

	}

	@Test
	@DisplayName("Test producer adds item to buffer")

	void testProducerAddsItemToBuffer() {
		MockProducer producer = new MockProducer(buffer);
		producer.addItem(new Item("abc"));
		assertEquals(1, buffer.getBufferSize());

	}

	@Test
	@DisplayName("Test Consumer Removes item from buffer")

	void testConsumerRemovesItem() {
		buffer.add(new Item(""));
		MockConsumer consumer = new MockConsumer(buffer);
		consumer.removeItem();
		assertEquals(0, buffer.getBufferSize());

	}

	@Test
	@DisplayName("Test queue exist when instantiating")

	void testQueueExist() {
		MockBuffer buffer2 = new MockBuffer();
		assertNotNull(buffer2.getBuffer());

	}

}
