package hi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest
{

	Person r;
	Person j;
	Person a;
	Person b;

	@BeforeEach
	void setUp() throws Exception
	{
		r = new Person("Romeo", "Montague", 15);
		j = new Person("Juliet", "Capulet", 13);
		a = new Person("Alice", "Smith", 30);
		b = new Person("Bob", "Doe", 32);
	}

	@Test
	void testToString()
	{
		assertEquals("Person: Romeo Montague, 15", r.toString());
	}

	@Test
	void testMakePerson()
	{
		assertThrows(UnderageException.class, () ->
		{
			Person child = r.makePerson(j);
		});
		assertThrows(UnderageException.class, () ->
		{
			Person child = a.makePerson(j);
		});
		try
		{
			Person child = a.makePerson(b);
			assertEquals(a.getFirstName(), child.getFirstName());
			assertEquals(b.getLastName(), child.getLastName());
			assertEquals(0, child.getAge());
		} catch (UnderageException e)
		{
			fail("exception thrown");
		}
	}
}
