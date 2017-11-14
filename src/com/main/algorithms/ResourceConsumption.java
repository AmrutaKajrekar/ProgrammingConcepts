package com.main.algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class ResourceConsumption {
	
	public static class LogRecord {
		public int UID,PID,StartTime,EndTime,Consumption,Total;
		
		public LogRecord(int UID,int PID,int StartTime,int EndTime,int Consumption) {
			this.UID = UID;
			this.PID = PID;
			this.StartTime = StartTime;
			this.EndTime = EndTime;
			this.Consumption = Consumption;
			this.Total = 0;
		}
		
		@Override
		public String toString() {
			String msg = String.format("\nUID = %d\tPID = %d\tStart = %d\tEnd = %d\tConsumption = %d\t Total = %d\n", 
					this.UID,
					this.PID,
					this.StartTime,
					this.EndTime,
					this.Consumption,
					this.Total);
			return msg;
		}
	}
	
	public static LogRecord[] logRecords = {
		new LogRecord(1, 1, 200, 300, 100),
		new LogRecord(2, 2, 230, 340, 80),
		new LogRecord(1, 3, 245, 315, 50),
		new LogRecord(1, 4, 305, 330, 20)
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Data");
		System.out.println(Arrays.toString(logRecords));
		
		Arrays.sort(logRecords, new Comparator<LogRecord>() {

			@Override
			public int compare(LogRecord o1, LogRecord o2) {
				// TODO Auto-generated method stub
				if(o1.UID < o2.UID) {
					return -1;  //small
				}
				
				if(o1.UID == o2.UID) {
					return 0;	//equal
				}
				
				
				return 1;	//big
			}
			
		});
		
		System.out.println("Sorted");
		System.out.println(Arrays.toString(logRecords));
		
		System.out.println("Calculate Totals");
		calculateTotal(logRecords);
		System.out.println(Arrays.toString(logRecords));

		int maxInd = getMaxTotal(logRecords);
		LogRecord maxRecord = logRecords[maxInd];
		System.out.println("Max Totals");
		String totalMsg = String.format("UID#%d\nBetween: %d - %d\nMax-Consumption: %d\n", 
				maxRecord.UID,
				maxRecord.StartTime,
				maxRecord.EndTime,
				maxRecord.Total);
		System.out.println(totalMsg);
		
	}
	
	public static void calculateTotal(LogRecord[] logRecords) {
		int len = logRecords.length;
		for(int i=0; i<len; i++) {
			LogRecord rec = logRecords[i];
			rec.Total = rec.Consumption;
			for(int j=i+1;j<len;j++) {
				LogRecord subRec = logRecords[j];
				if(subRec.StartTime >= rec.EndTime) {
					break;
				}
				
				if( (rec.StartTime <= subRec.StartTime) && (rec.EndTime > subRec.StartTime) ) {
					rec.Total += subRec.Consumption;
					continue;
				}
				
				break;
			}
		}
		
	}
	
	public static int getMaxTotal(LogRecord[] logRecords) {
		int maxInd = 0;
		int maxVal = logRecords[maxInd].Total;
		int len = logRecords.length;
		
		for(int i=1;i<len;i++) {
			if(maxVal < logRecords[i].Total) {
				maxInd = i;
				maxVal = logRecords[i].Total;
			}
		}
		
		return maxInd;
	}

}