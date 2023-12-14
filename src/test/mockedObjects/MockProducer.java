package test.mockedObjects;

import main.Buffer;
import main.Item;
import main.Producer;

public class MockProducer implements Producer {
	Buffer buffer = null;

	public MockProducer(Buffer buffer) {
		this.buffer = buffer;

	}

	public Item addItem(Item item) {
		buffer.add(item);
		return item;
	}

	@Override
	public void run() {
	}

	@Override
	public void stopRunning() {
	}

}
