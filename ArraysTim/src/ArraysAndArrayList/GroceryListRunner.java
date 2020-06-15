package ArraysAndArrayList;

import java.util.Scanner;

public class GroceryListRunner {
	private static Scanner scanner =new Scanner(System.in);
	public static GroceryList groceryList=new GroceryList();
	public static void main(String[] args) {
		boolean quit=false;
		int choice=0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter your choice: ");
			choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0: printInstructions();
			break;
			
			case 1: 
				groceryList.printGroceryList();
			break;
			
			case 2: addItem();
			break;
			
			case 3: modifyItem();
			break;
			
			case 4: removeItem();
			break;
			
			case 5: searchForItem();
			break;
			
			case 6: 
				quit=true;
				
			break;
			}
		}
	}
	private static void searchForItem() {
		System.out.println("ENter item to search for");
		String searchItem=scanner.nextLine();
		if(groceryList.findItem(searchItem)!=null) {
			System.out.println("found "+searchItem+" in grocery list");
		}else {
			System.out.println(searchItem +" i not in shopping list");
		}
		
	}
	private static void removeItem() {
		System.out.println("ENter item no.");
		int itemNo=scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(itemNo);
		
	}
	private static void modifyItem() {
		System.out.println("ENter item no.");
		int itemNo=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter replacement item");
		String newItem=scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo-1, newItem);
		
	}
	public static void addItem() {
     System.out.println("Enter the grocery item");
     groceryList.addGroceryItem(scanner.nextLine());
	 
	}
}
