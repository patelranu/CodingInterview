package com.designprogram;

public class CharPrint {
	public static void main(String[] args) {
		int value = 65;
        for (int i = 0; i <= 5; i++)
{
    for (int j = 0; j <= i; j++)
    {
        System.out.print((char) (value + j) + " ");
    }
    System.out.println();
}
}

}
