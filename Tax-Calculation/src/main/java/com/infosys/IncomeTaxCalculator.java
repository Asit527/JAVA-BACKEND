package com.infosys;

public class IncomeTaxCalculator {


		public int calculate( int income) {
			if(income<400000)
				return 0;

			else if(income<800000)
				return (income/100)*5;

			else if( income<1200000)
				return (income/100)*10;

			else if(income<1600000)
				return (income/100)*15;

			else if( income<2000000)
				return (income/100)*20;

			else if(income<2400000)
				return (income/100)*25;

			else
				return (income/100)*30;


		}
}
