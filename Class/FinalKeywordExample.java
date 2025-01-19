class Base{
    final void show(){
        System.out.println("This method cannot be overridden");
    }

}
class Derived extends Base {
    // void show(){
    //     System.out.println("Attempt to override");
    // }
}
public class FinalKeywordExample{
    public static void main(String[] args){
        Derived obj = new Derived();
        obj.show();
    }
}