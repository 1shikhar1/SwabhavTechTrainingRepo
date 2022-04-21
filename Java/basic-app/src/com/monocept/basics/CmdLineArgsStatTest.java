package com.monocept.basics;

public class CmdLineArgsStatTest {
	public static void main(String[] args){
		int max, min, sum = 0;
		double average = 0;

		if (args.length>0) {
			max = Integer.parseInt(args[0]);
			min = Integer.parseInt(args[0]);
			
			for(String item: args) {
				int num = Integer.parseInt(item);
				
				if(max<num)
					max = num;
				if(min>num)
					min = num;
				
				sum = sum+num;
			}
			average = sum/args.length; 
			
			System.out.println("Max num: "+max);
			System.out.println("Min num: "+min);
			System.out.println("Sum: "+sum);
			System.out.println("Average: "+average);
		}
		else
			System.out.println("No arguments passed.");
	}

}
