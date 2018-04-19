package com.sankar;

class TestLinkedList {
	public static void main(String[] args) {

		int[] data = { 10, 20, 30, 15, 40, 66 };
		Object[][] linkedList = new Object[1][2];
		createLinkedList(data, linkedList);
		printLinkedList(linkedList);

	}

	public static void createLinkedList(int[] data, Object[][] linkedList) {
		Object node[][] = null;
		Object newnode[][] = null;
		node = new Object[1][2];
		linkedList[0][1] = node;
		for (int i = 0; i < data.length; i++) {
			node[0][0] = new Integer(data[i]);
			newnode = new Object[1][2];
			node[0][1] = newnode;
			node = newnode;

		}
		node = null;
		newnode = null;
	}

	public static void printLinkedList(Object[][] linkedList) {

		Object node[][] = null;
		node = linkedList;
		node = (Object[][]) node[0][1];
		while (node[0][1] != null) {
			System.out.print("  " + node[0][0] + " --->");
			node = (Object[][]) node[0][1];

		}
		System.out.print("null");

	}
}
