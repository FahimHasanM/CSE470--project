package tester;
import runner.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BikeRentTest {
	BikeRent br;
	
	
	@BeforeEach
	void setUp() throws Exception {
		br = new BikeRent();
	}

	@Test
	void testSearchBike() {
		int i = 0;
		while(br.b[i] != null) {
			br.b[i] = null;
			i++;
		}
		br.check = 0;
		
		Bikes bb = br.addBike("Yamaha","R16",4000);
		i++;
		String ss = br.searchBike("R16");
		assertEquals("Found it",ss);
		
	}
	
	@Test
	void testAddBike() {
		int i = 0;
		while(br.b[i] != null) {
			br.b[i] = null;
			i++;
		}
		br.check = 0;
		Bikes bb = br.addBike("Yamaha","R16",4000);
		i++;
		assertEquals("R16",bb.model);
	}
	
	@Test
	void testBookBike() {
		int i = 0;
		while(br.b[i] != null) {
			br.b[i] = null;
			i++;
		}
		br.check = 0;

		Bikes bb = br.addBike("Yamaha","R16",4000);
		assertEquals("Booked successfully.",br.bookBike(1));
	}
	

}
