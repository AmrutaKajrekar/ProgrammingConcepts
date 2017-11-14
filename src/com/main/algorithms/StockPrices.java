package com.main.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.joda.time.DateTime;

/**
 * @author amruta.kajrekar
 *
 */
public class StockPrices {

	public static HashMap<DateTime, Double> timeAndPrices = new HashMap<DateTime, Double>();
	
	public static void main(String[] args) {
		StockPrices sp = new StockPrices();
		DateTime dateTime1 = new DateTime();
		DateTime date2 = dateTime1;
		StockPrices.timeAndPrices.put(dateTime1, 13.33);
		dateTime1 = dateTime1.minusMinutes(15);
		StockPrices.timeAndPrices.put(dateTime1, 17.86);
		dateTime1 = dateTime1.minusMinutes(15);
		StockPrices.timeAndPrices.put(dateTime1, 2.84);
		dateTime1 = dateTime1.minusMinutes(15);
		StockPrices.timeAndPrices.put(dateTime1, 0.12);
		dateTime1 = dateTime1.minusMinutes(15);
		StockPrices.timeAndPrices.put(dateTime1, 7.9);
		
		dateTime1 = dateTime1.minusDays(1);
		StockPrices.timeAndPrices.put(dateTime1, 17.2);
		
		dateTime1 = dateTime1.minusDays(1);
		StockPrices.timeAndPrices.put(dateTime1, 16.3);
		
		printTimeAndPricesMap();
		
		sp.findStockPriceAtGivenTimeStamp(dateTime1);
		
		double returnVal = 1;
		while(returnVal != 0){
			returnVal = sp.deleteAndGetMinimumStockPriceForToday();
		}
		
		System.out.println("--------------------------RE-PRINTING ----------------------");
		printTimeAndPricesMap();
		sp.findStockPriceAtGivenTimeStamp(date2);
		
	}

	private static void printTimeAndPricesMap() {
		System.out.println("*************************PRINTING*************************");
		Iterator<Entry<DateTime, Double>> it = timeAndPrices.entrySet().iterator();
		while(it.hasNext()){
			Entry<DateTime, Double> pair = it.next();
			System.out.println("time = " + pair.getKey() + ", price = "+ pair.getValue());
		}
		System.out.println("**********************************************************");
	}

	private double findStockPriceAtGivenTimeStamp(DateTime timestamp){
		System.out.println("*************************Find StockPrice at given timestamp*************************");
		System.out.println("time = " + timestamp);
		Double returnValue = timeAndPrices.get(timestamp);
		System.out.println("price returned = " + returnValue);
		return returnValue;
	}
	
	private double deleteAndGetMinimumStockPriceForToday(){
		System.out.println("*************************Delete and get minimum*************************");
		DateTime today = new DateTime().withTimeAtStartOfDay();
		DateTime tomm = new DateTime().plusDays(1).withTimeAtStartOfDay();
		Iterator<Entry<DateTime, Double>> it = timeAndPrices.entrySet().iterator();
		
		double min = Double.MAX_VALUE;
		DateTime toBeDeleted = null;
		List<Double> list = new ArrayList<Double>();
		while(it.hasNext()){
			Entry<DateTime, Double> pair = it.next();
			DateTime dateOnly = pair.getKey();
			if(dateOnly.isAfter(today) && dateOnly.isBefore(tomm)){
				list.add(pair.getValue());
				if(pair.getValue() < min){
					min = pair.getValue();
					toBeDeleted = pair.getKey();
				}
			}
		}
		
		if(toBeDeleted!=null){
			System.out.println("toBeDeleted = " + toBeDeleted + ",     value = " + min);
			timeAndPrices.remove(toBeDeleted);
			return min;
		}else{
			return 0;
		}
	}
}
