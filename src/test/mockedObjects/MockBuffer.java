package test.mockedObjects;

import java.util.Queue;

import main.Buffer;
import main.Item;

public class MockBuffer extends Buffer {

	public Queue<Item> getBuffer() {
		return buffer;
	}

	public int getBufferSize() {
		return buffer.size();
	}
}
