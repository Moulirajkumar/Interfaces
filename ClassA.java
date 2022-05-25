package interfaces;

public class ClassA implements InterfaceA,InterfaceB
{

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	public static void main(String[] args)
	{
		ClassA obj=new ClassA();
		int x=obj.sub(a, b);
		System.out.println("The Substraction of two numbers: "+x);
		InterfaceA.Sum(6446, 64654);
		InterfaceA obj2=obj;
		int y=obj2.sub(50, 10);
		System.out.println("This is InterfaceA SUB method output: "+y);
		InterfaceB obj3=obj;
		int z=obj3.sub(100, 50);
		System.out.println("This is InterfaceB SUB method output: "+z);
	}
}
