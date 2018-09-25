/**
 * 
 */
package g1demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Nilesh Devdas
 *
 */
public class EmployeeTest {
	Employee employee = null;

	@Before
	public void setUp() throws Exception {
		employee = new Employee();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetId() {
		employee.setId(1);
		assertTrue(employee.getId() == 1);
	}

	@Test
	public void testSetId() {
		employee.setId(1);
		assertTrue(employee.getId() == 1);

	}

	@Test
	public void testGetName() {
		employee.setName("Nilesh");
		assertTrue(employee.getName().equals("Nilesh"));
	}

	@Test
	public void testSetName() {
		employee.setName("Nilesh");
		assertTrue(employee.getName().equals("Nilesh"));
	}

	@Test
	public void testGetEmail() {
		employee.setEmail("nilesh@email.com");
		assertTrue(employee.getEmail().equals("nilesh@email.com"));

	}

	/**
	 * Test method for {@link g1demo.Employee#setEmail(java.lang.String)}.
	 */
	@Test
	public void testSetEmail() {
		employee.setEmail("nilesh@email.com");
		assertTrue(employee.getEmail().equals("nilesh@email.com"));
	}

}
