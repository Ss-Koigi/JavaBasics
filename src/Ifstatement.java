public class Ifstatement {
    public static void main(String [] args){
        int X=21;
        String Z=(X>=18)? "Venture forth in Java": "Figure things out before commiting";  //Ternary operator
        System.out.println(Z);
        int level=1;
        if(level<10){
            System.out.println("Grind some more SOLIDER!!");
        }
        else{
            System.out.println("Welcome to advanced Bootcamp Cadet!");
        }
    }
}
