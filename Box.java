
public class Box {
	
	float width,height,depth,volume;
	Box(float width, float height, float depth)
	{
		 this.width = width;
		 this.height =height;
		 this.depth = depth;
	}
	float calculateVolume()
	{
		volume = width*height*depth;
		System.out.println("Volume of Box is : "+volume);
		return volume;
	}
	public static void main(String args[])
	{
		Box b1 = new Box(10,20,5);
		b1.calculateVolume();
	}

}
