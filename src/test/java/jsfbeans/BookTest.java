package jsfbeans;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
	
	
	@Test
	public void testSaveReturnToIndex() {
		/* Tests the save() method of the Book class.
		 * Verifies that the method returns 'index' when all fields
		 * are set correctly.
		 */
		
		// Arrange: Create an instance of the Book class with test data
		Book book = new Book();
		book.setAuthor("Max Mustermann");
		book.setName("Muster Buch");
		book.setPublishDate("2005");
		book.setPrice("129.99");
		
		// Act: Call the save() method
		String result = book.save();
		
		// Assert: Check if the method returns "index"
		assertEquals("index", result, "The Method: save() should return 'index'");
		
	}
	
}
