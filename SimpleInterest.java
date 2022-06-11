package com.prodapt.WA1;

public class SimpleInterest {
static int rate;
static int principal;
static int time;
 void process(int p,int r,int t)
 {
	 principal=p;
	 rate=r;
	 time=t;
	 int si=(principal*rate*time)/100;
			System.out.println(si+principal+" is the total loan amount to be paid "); 
 }
}
