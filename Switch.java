package corejava;

import java.util.Scanner;

class Switch {

	public static void main(String[] args) {
		int num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers:");
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println("enter the operators(+,-,*,/)");
		char op=scan.next().charAt(0);
		int o;
		switch(op)
		{
		case '+':
			o=num1+num2;
			System.out.println("add="+o);
			break;
		case '-':
			o=num1-num2;
			System.out.println("sub="+o);
			break;
		case '*':
			o=num1*num2;
			System.out.println("mul="+o);
			break;
		case '/':
			o=num1/num2;
			System.out.println("div="+o);
			break;
		}
		
		// TODO Auto-generated method stub

	}

}
