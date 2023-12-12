package util031;

public class Tool031 {
  public static boolean isUsable031(String s) {
    if (s != null && !s.isBlank()) return true;
    return false;
  }

  public static boolean isUsable031(Object[] objects) {
    if (objects != null && objects.length > 0) {
      return true;
    }
    return false;
  }

  public static int count031(Object[] objects) {
    if (!isUsable031(objects)) return -1;
    int i = 0;
    for (i = 0; i < objects.length; i++) {
    }
    return i;
  }

}
