import util031.Tool031;
import valuable031.Container031;
import valuable031.Item031;

public class main {
  public static void main(String[] args) {

  }
  static void testTool(){
    Object [] objects = new Object[0];
    System.out.println(Tool031.isUsable031(""));
    System.out.println(Tool031.isUsable031("Hello"));
    System.out.println(Tool031.isUsable031(objects));
    System.out.println("Count : " + Tool031.count031(objects));
    objects = new Object[5];
    System.out.println(Tool031.isUsable031(objects));
    System.out.println(Tool031.count031(objects));
    objects[1] = "Hello";
    System.out.println(Tool031.count031(objects));
    System.out.println(objects[1]);
    objects[2] = 5;
    objects[3] = true;
    System.out.println(Tool031.isUsable031(objects));
    System.out.println(Tool031.count031(objects));
  }
  static void testItem(){
    System.out.println("Create: " + Item031.create("Fred",10));
    System.out.println("Create: " + Item031.create("Viktor",5));
    System.out.println("Create: " + Item031.create("",5));
    System.out.println("................");
    System.out.println("Add: " + Item031.create("Megan",5).add(Item031.create("Ted",4)));
    System.out.println("................");
//    System.out.println("Name Matched: " + Item031.create("Jason",1).isMatched(Item031.create("Jason",5)));
//    System.out.println("Name Matched: " + Item031.create("Jason",1).isMatched(Item031.create("May"),1));
  }
  static void testContainer(){
    Item031 item1 = new Item031("Jason", 5);
    Item031 item2 = new Item031("Mandy", 3);
    Item031 item3 = new Item031("Ted", 10);
    Item031 item4 = new Item031("Freddy", 2);
    Item031 item5 = new Item031("Chick", 7);
    Item031 item6 = new Item031("Fox", 15);
    Container031 container = new Container031();
    container.add(item1);
    System.out.println(container);
    container.add(item2);
    System.out.println(container);
    container.add(item3);
    container.add(item4);
    container.add(item5);
    System.out.println(container);
    container.remove(item1);
    System.out.println(container);
  }
}
