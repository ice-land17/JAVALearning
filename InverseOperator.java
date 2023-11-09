public class InverseOperator
{
	public static void main(String[]args)
	{
		// 操作时取反 T->F  ,F->T
		System.out.println(60 > 20);
		System.out.println(!(60 > 20));

		boolean b = (10 > 1) ^ (3 > 5);
		System.out.println("b=" + b);
	}
}