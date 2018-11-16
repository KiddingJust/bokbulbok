package Order;

import java.util.Scanner;

public class OrderSystem {

	Menu[] arr;
	Menu[] orderedMenu = new Menu[3];
	
	public OrderSystem(Menu[] arr) {
		this.arr = arr;
	}
	
	public void showMenu() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
		
	public void order() {
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < orderedMenu.length; i++) {
			System.out.println("메뉴 번호는? ");
			int idx = Integer.parseInt(scanner.nextLine());
			orderedMenu[i] = arr[idx];
			System.out.println("주문 수량은?? ");
			int qty = Integer.parseInt(scanner.nextLine());
			orderedMenu[i].qty = qty;
			
		
		}//for end
	
	}



}//class end
