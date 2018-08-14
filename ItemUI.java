
import java.util.Scanner;

public class ItemUI {
    ItemService itemService;
    Scanner scan;

    public ItemUI(ItemService itemService) {
        this.itemService = itemService;
        this.scan = new Scanner(System.in);
    }

    public void playGame(){
        for(int i=0; i < itemService.items.length; i++){
            System.out.println("마음의 준비를 하고 쏘세요~~~~~~~");
            scan.nextLine();
            System.out.println(itemService.selectOne().value);
            if (itemService.items[i].value=="당첨"){
                System.out.println("축하합니다!!!!!");
                break;
            }
        }


    }




}
