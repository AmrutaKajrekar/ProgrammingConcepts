package com.main.algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @author amruta.kajrekar
 *
 */
public class MaxResources {

	static HashMap<Integer, Resources> resources = new HashMap<Integer, Resources>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaxResources max = new MaxResources();
		Resources rsc = max.new Resources(1,1,200,300,100);
		addResourcesForUser(1,rsc);
		rsc = max.new Resources(2,2,230,340,80);
		addResourcesForUser(2,rsc);
		rsc = max.new Resources(1,3,245,315,50);
		addResourcesForUser(1,rsc);
		rsc = max.new Resources(1,4,305,330,20);
		addResourcesForUser(1,rsc);
		
		printResources();
	}

	private static void printResources() {
		Iterator<Entry<Integer, Resources>> it = resources.entrySet().iterator();
		
		while(it.hasNext()){
			Entry<Integer, Resources> next = it.next();
			Resources r = next.getValue();
			System.out.println(next.getKey() + "\nAnd values = " + r.uid + ":: " + r.pid + ":: " + r.startTime + ":: " + r.endTime + ":: " + r.consumption);
		}
	}

	private static void addResourcesForUser(int i, Resources rsc) {
		Resources val = resources.get(i);
		if(val==null){
		resources.put(i, rsc);
		}else{
			int minStart = Integer.MAX_VALUE;
			int maxEnd = Integer.MIN_VALUE;
			int totalConsumption = 0;
			if(val.startTime < rsc.startTime){
				minStart = val.startTime;
				totalConsumption += val.consumption;
			}else{
				minStart = rsc.startTime;
				totalConsumption += rsc.consumption;
			}
				
			if(val.endTime > rsc.endTime){
				maxEnd = val.endTime;
				totalConsumption += val.consumption;
			}else{
				maxEnd = rsc.endTime;
				totalConsumption += rsc.consumption;
			}
			rsc.startTime = minStart;
			rsc.endTime = maxEnd;
			rsc.consumption = totalConsumption;
			resources.put(i, rsc);
		}
	}

	class Resources{
		private int uid,pid,startTime,endTime,consumption;
		
		public Resources(){
			this.uid = 0;
			this.pid = 0;
			this.startTime = 0;
			this.endTime = 0;
			this.consumption = 0;
		}
		
		public Resources(int pUid,int pPid, int pStartTime, int pEndTime, int pConsumption){
			this.uid = pUid;
			this.pid = pPid;
			this.startTime = pStartTime;
			this.endTime = pEndTime;
			this.consumption = pConsumption;
		}
		
	}
}
