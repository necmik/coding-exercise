package com.coding.upwork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class Track {

	Map<String, TreeSet<Integer>> serverMap = new HashMap<>();
	
	public String attach(String serverType) {
		int serverNumber = 0;
		if (!serverMap.containsKey(serverType)) {
			serverNumber = 1;
			serverMap.put(serverType, new TreeSet<Integer>(Arrays.asList(serverNumber)));
		} else {
			TreeSet<Integer> serverNumberSet = serverMap.get(serverType);
			serverNumber = getNextServerNumber(serverNumberSet);
			serverNumberSet.add(serverNumber);
		}
		String serverLabel = serverType+":"+serverNumber;
		System.out.println(serverLabel);
		return serverLabel;
	}
	
	public void detach(String serverLabel) {
		String[] serverSplit = serverLabel.split(":");
		String serverType = serverSplit[0];
		Integer serverNumber = Integer.valueOf(serverSplit[1]);
		
		TreeSet<Integer> serverNumberSet = serverMap.get(serverType);
		if (serverNumberSet != null) {
			serverNumberSet.remove(serverNumber);
		}		
	}
		
	private Integer getNextServerNumber(TreeSet<Integer> serverNumbers) {
		int prevServerNumber = 0;
		
		Iterator<Integer> it = serverNumbers.iterator();
		while (it.hasNext()) {
			int currentServerNum = it.next();
			if (currentServerNum - prevServerNumber > 1) {
				break;
			}
			prevServerNumber++;				
		}
		
		return prevServerNumber + 1;
	}
	
	public static void main(String[] args) {
		Track tracker = new Track();
		tracker.attach("apibox");
		tracker.attach("apibox");
		tracker.attach("apibox");
		tracker.attach("apibox");

		tracker.detach("apibox:2");
		tracker.detach("apibox:3");

		tracker.attach("apibox");

		tracker.attach("apibox");

		tracker.detach("apibox:2");
		tracker.attach("apibox");

		tracker.attach("sitebox");

		tracker.attach("sitebox");

		tracker.attach("apibox");
	}
}
