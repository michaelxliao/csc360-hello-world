package hi;

public class Person
{
	String firstName;
	String lastName;
	int age;
	/**
	 * @param firstName first name of person
	 * @param lastName last name of person
	 * @param age age of person in years
	 */
	public Person(String firstName, String lastName, int age)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Person: " + firstName + " " + lastName + ", " + age;
	}
	
	public Person makePerson(Person that) throws UnderageException {
		if (age < 18 || that.getAge() < 18) {
			throw new UnderageException();
		}
		return new Person(this.getFirstName(), that.getLastName(), 0);
	}
}
