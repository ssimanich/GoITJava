package Stack;

public class AwesomeStack {

    public static void main(String[] args) {
        int[] data={1,2,3,4,5,6,7,8,9,10,11};
        Stack mStack = new Stack(125);
        for(int i=0;i<data.length;i++)
        {mStack.addElement(data[i]);
        int y=data[i];
        System.out.print(y+" ");}
        System.out.println("");
        while (!mStack.isEmpty()){
            int x =mStack.deleteElement();
            System.out.print(x+" ");}
        }
}


