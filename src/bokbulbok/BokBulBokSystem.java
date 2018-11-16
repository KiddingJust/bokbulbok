package bokbulbok;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BokBulBokSystem {

	Item[] items;
	Scanner scanner;
	
	public BokBulBokSystem(Item[] items) {
		this.scanner = new Scanner(System.in);
		this.items = items;
		Collections.shuffle(Arrays.asList(this.items));
		//System.out.println(Arrays.toString(this.items));
	}
	
	public void playGame() {
		
		for(int i = 0; i < this.items.length; i++){
			System.out.println("마음의 준비를 하고 Enter");
			scanner.nextLine();											// 아무것도 없으면 enter 
			Item item = this.items[i];
			System.out.println(item);
			if(item.value.equals("당첨")) {
				System.out.println("운명은 너를 선택했어..잘 먹을께");
				break;
			}
			
		}
		
	}
	
}









