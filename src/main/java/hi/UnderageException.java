package hi;

public class UnderageException extends Exception
{

	public UnderageException()
	{
		super("Parent is too young!");
	}

	public UnderageException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UnderageException(Throwable cause)
	{
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public UnderageException(String message, Throwable cause)
	{
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UnderageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
