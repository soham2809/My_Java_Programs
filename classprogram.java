class demo {
    public int add (int a, int b) {
        int result =a+b;
        return result;

    }
}

public class classprogram {

    public static void main(String[] args) {
      demo obj=new demo ();
        int value = obj.add(12, 8899);
        System.out.println (value);
    }
    // TODO Auto-generated method stub

}
