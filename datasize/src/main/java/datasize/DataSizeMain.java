package datasize;

import org.springframework.util.unit.DataSize;

/**
 * @author Moritz Halbritter
 */
class DataSizeMain {
	public static void main(String[] args) {
		DataSize dataSize = DataSize.ofBytes(12);
		System.out.println(dataSize);
	}
}
