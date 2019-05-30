package control;
import java.util.ArrayList;

import java.util.Scanner;;

public class Shop {
	ArrayList<Item> items = new ArrayList<Item>();
	public Shop(ArrayList<Item> items){
		this.items = items;
	}
	public void showItems(Player player) {
		int select;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("살 물건을 고르세요");
			System.out.println("현재 금액: " + player.getGold());
			for(int i = 0; i < items.size(); i++) {
				System.out.printf("%d. %s(%d원)\n", (i + 1), items.get(i).getName(), items.get(i).getPrice());
			}
			System.out.printf("%d. 나가기\n", items.size() + 1);
			System.out.print("Input: ");
			select = scanner.nextInt();
			if(select < items.size()) {
				Item selectedItem = items.get(select - 1);
				int currentGold = player.getGold();
				if(currentGold >= selectedItem.getPrice()) {
					player.getItems().add(items.get(select - 1));
					player.setGold(currentGold - selectedItem.getPrice());
				}
				else {
					System.out.println("현금이 부족하여 살 수 없습니다!!");
				}
			}else {
				break;
			}
		}
		
	}
}
