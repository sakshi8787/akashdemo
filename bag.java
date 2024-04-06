class bag
{
	int noOfComponent;
	String colour;
	double price;
	static int b;

	public void toCarry()
	{
		System.out.println("It is use to carry books");
	}
	public static void main (String[]args)
	{
		bag b= new bag();
		System.out.println(b.noOfComponent);
		System.out.println(b.colour);
		System.out.println(b.price);
		b.toCarry();
		b.colour="Black";
		System.out.println(b.colour);
	}
}
