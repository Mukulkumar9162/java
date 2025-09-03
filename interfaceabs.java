public class interfaceabs {
    public static void main (String[]args){
        child c=new child();
        c.pitai();
        c.pyar(86);

    }
    
}
interface papa{    
    void pitai();

}
interface  mummy  {      // multiple inheritance
    void pyar(int a);

    
}
 class child implements papa,mummy{
   public void pitai(){
        System.out.println("pit dunga");
    }
    public void pyar(int x){
        System.out.println(" pyara bacha");
    }

    
}
