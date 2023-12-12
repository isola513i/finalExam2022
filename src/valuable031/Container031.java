package valuable031;


public class Container031 {
  private final Item031[] items = new Item031[999];

  public boolean add(Item031 item) {
    for (int i = 0; i < items.length; i++) {
      if (item.isMatched(item)) {
        items[i] = item;
        return true;
      }
    }
    for (int i = 0; i < items.length; i++) {
      if (items[i] == null) {
        items[i] = item;
      }
      return true;
    }
    return false;
  }

  public boolean remove(Item031 item) {
    for (int i = 0; i < items.length; i++) {

      if (items[i] != null && items[i].isMatched(item)) {
        items[i] = null;
        return true;
//                for (int j = i; j < items.length - 1 ; j++) {
//                    items[j] = items[j + 1];
//                }
//                items[items.length - 1] = null;
//                return true;
      }
    }
    return false;
  }

}
