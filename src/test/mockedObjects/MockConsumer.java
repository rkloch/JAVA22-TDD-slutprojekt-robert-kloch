package test.mockedObjects;

import main.Buffer;

public class MockConsumer implements main.Consumer {
	Buffer buffer;

	public MockConsumer(Buffer buffer) {
		this.buffer = buffer;

	}

	public void removeItem() {
		buffer.remove();
	}

	@Override
	public void run() {
	}

	@Override
	public void stopRunning() {
	}

}
