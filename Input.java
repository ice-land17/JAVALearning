//1.����Scanner�����ڵİ�
import java.util.Scanner;
public class Input
{
	public static void main(String[]args)
	{
		//2.����Scanner����,new����һ������,myScanner����Scanner��Ķ���
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������:");
		String name = myScanner.next();
		System.out.println("����������:");
		int age = myScanner.nextInt();
		System.out.println("������нˮ:");
		double sal = myScanner.nextDouble();
		System.out.println("�˵���Ϣ����: ");
		System.out.println("����=:" + name + "����=:" + age + "нˮ=:" + sal);
	}
}
