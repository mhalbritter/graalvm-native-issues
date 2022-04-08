package datasize;

import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

/**
 * @author Moritz Halbritter
 */
class DataSizeMain {
	public static void main(String[] args) {
//		dataSizeOnly();
//		dataUnitOnly();
		both();
	}

	private static void both() {
		DataSize dataSize = DataSize.of(12, DataUnit.KILOBYTES);
		System.out.println(dataSize);
	}

	private static void dataUnitOnly() {
		System.out.println(DataUnit.KILOBYTES);
	}

	private static void dataSizeOnly() {
		DataSize dataSize = DataSize.ofBytes(12);
		System.out.println(dataSize);
	}
}
