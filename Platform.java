public class Platform
{
	private int length;
	private int x;
	private int y;

	public static final int RANGE = 100;
	public static final int MINIMUM_LENGTH = 40;
	public static final int FRAME_WIDTH = 480;
	public static final int FRAME_HEIGHT = 640;

	// constructors
	public Platform()
	{
		this.length = (int)(Math.random() * RANGE + MINIMUM_LENGTH);
		this.x = (int)(Math.random() * (FRAME_WIDTH - length));
		this.y = 0;
	}
	public Platform(int y)
	{
		this();

		if (y >= 0)
			this.y = y;
	}
	public Platform(int x, int y, int length)
	{
		this();

		if (x >= 0)
			this.x = x;
		if (y >= 0)
			this.y = y;
		if (length > 0)
			this.length = length;
	}

	// accessors
	public int getLength()
	{
		return length;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}

	// mutators
	public void setLength(int length)
	{
		if (length > 0)
			this.length = length;
	}
	public void setX(int x)
	{
		if (x >= 0)
			this.x = x;
	}
	public void setY(int y)
	{
		if (y >= 0)
			this.y = y;
	}

	public void reset(int y)
	{
		if (y >= 0)
			this.y = y;

		this.length = (int)(Math.random() * RANGE + MINIMUM_LENGTH);
		this.x = (int)(Math.random() * (FRAME_WIDTH - this.length));
	}
}
