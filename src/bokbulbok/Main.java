package bokbulbok;

public class Main {

	public static void main(String[] args) {
		
		Item[] arr = 
			{
				new Item("꽝"),
				new Item("꽝"),
				new Item("꽝"),
				new Item("꽝"),
				new Item("당첨")
			};
		
		BokBulBokSystem obj = new BokBulBokSystem(arr);
		obj.playGame();
		
	}
}