package com.acadgild;

/**
 * 
 * Program to demonstrate how the capacity changes when a string is appended to
 * StringBuilder or StringBuffer
 *
 */
public class Session7Assignment3 {

	public static void main(String[] args) {
		// Initialize StringBuffer
		StringBuffer buffer3 = new StringBuffer("Deepak");
		System.out.println("StringBuffer Value = " + buffer3.toString());
		System.out.println("buffer3.length() = " + buffer3.length());
		// Capacity = 16 + 6 (Length of String)
		System.out.println("buffer3 capacity: " + buffer3.capacity());

		System.out.println("****************************************");
		// Append string to StringBuffer
		buffer3.append(" Kumar");
		System.out.println("StringBuffer Value = " + buffer3.toString());
		System.out.println("buffer3.length() = " + buffer3.length());
		// Here, after appending string length is 17, so capacity won't be
		// increased as the concatenated string can be accommodated in length
		// 22.
		System.out.println("buffer3 capacity: " + buffer3.capacity());

		System.out.println("****************************************");
		buffer3.append(" Srichandan Ray");
		System.out.println("StringBuffer Value = " + buffer3.toString());
		System.out.println("buffer3.length() = " + buffer3.length());
		// Here, after appending string length is 27, which cannot be
		// accommodated in length 27, so the capacity of the StringBuffer will be
		// increased by 22*2+2 i.e. 46
		System.out.println("buffer3 capacity: " + buffer3.capacity());
	}

}
