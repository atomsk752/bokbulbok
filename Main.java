
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ItemVO[] items = {
                new ItemVO("꽝"),
                new ItemVO("꽝"),
                new ItemVO("꽝"),
                new ItemVO("꽝"),
                new ItemVO("꽝"),
                new ItemVO("꽝"),
                new ItemVO("꽝"),
                new ItemVO("당첨")
        };

        ItemService itemService = new ItemService(items);
        itemService.shuffle();

        ItemUI itemUI = new ItemUI(itemService);
        itemUI.playGame();



        System.out.println(itemService);

    }
}
