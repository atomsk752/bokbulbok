
import java.util.Arrays;
import java.util.Collections;

public class ItemService {
    ItemVO[] items;
    int idx = 0;

    public ItemService(ItemVO[] items) {
        this.items = items;
    }

    public void shuffle(){
        Collections.shuffle(Arrays.asList(items));
    }

    public ItemVO selectOne(){
        ItemVO result = this.items[idx];
        idx++;
        return result;
    }







    @Override
    public String toString() {
        return "ItemService{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
