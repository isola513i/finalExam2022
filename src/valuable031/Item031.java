package valuable031;

import static util031.Tool031.*;

public class Item031 {
  private final String name;
  private int amount;

  public Item031(String name, int amount) {
    this.name = name;
    this.amount = amount;
  }

  public static Item031 create(String name, int amount) {
    if (isUsable031(name) && amount > 0) {
      return new Item031(name, amount);
    } else {
      return null;
    }
  }

  @Override
  public String toString(){
    return String.format("Item999 (Name: %s, Amount: %d)", name,amount);
  }

  public int add(Item031 item) {
    int sum = amount + item.amount;
    amount = sum;
    return sum;
  }

  public boolean isMatched(Item031 item){
    if (item.name != null && item.name.equals(name)) return true;
    return false;
  }

}