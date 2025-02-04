/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Application {

    public static void main(String[] args) {
        Mother m1 = new Child();
        System.out.println("Calling m1.show(): ");
        m1.show();  
        System.out.println("Calling m1.staticShow(): ");
        m1.staticShow(); 
        Child c1 = new Child();
        System.out.println("Calling c1.show(): ");
        c1.show();  
        
        System.out.println("Calling Child.staticShow(): ");
        Child.staticShow(); 
    }
}
