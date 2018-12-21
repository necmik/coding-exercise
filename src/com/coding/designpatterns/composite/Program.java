package com.coding.designpatterns.composite;

public class Program {

	public static void main(String[] args) {
		Housing building = new Housing("123 Street");
		Housing floor1 = new Housing("123 Street First Floor");
		int firstFloor = building.addStructure(floor1);
		Room washroom1m = new Room("1F Men's Washroom");
		Room washroom1f = new Room("1F Women's Washroom");
		Room common1 = new Room("1F Common Washroom");
		int firstMens = floor1.addStructure(washroom1m);
		int firstWomens = floor1.addStructure(washroom1f);
		int firstCommon = floor1.addStructure(common1);
		
		building.enter();
		Housing currentFloor = (Housing) building.getStructure(firstFloor);
		currentFloor.enter();
		
		Room currentRoom = (Room) currentFloor.getStructure(firstMens);
		currentRoom.enter();
		
		currentRoom = (Room) currentFloor.getStructure(firstCommon);
		currentRoom.enter();
	}
}
