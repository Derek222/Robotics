/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {

    String [] mystring= new String[]{"Hello", "World", "in", "A", "Frame","velociraptor"};
    
    char block = '*';
    int max_length = mystring[0].length();
    int number;
    int spacing;
    
    number = mystring.length;
    for(int i = 1;i<number;i++){
        if(mystring[i].length()>max_length){
            max_length = mystring[i].length();
        }
    }
    
   
    for (int i=1; i<=max_length+2; i++){
        System.out.print(block);
        
    }
    System.out.println();
    
    for (int i=0; i<number; i++){
        spacing = max_length - mystring[i].length();
        System.out.print(block + mystring[i] );
        for(int j=0; j<spacing; j++ ){
            System.out.print(" ");
        }
        System.out.println(block);
    }
       for (int i=1; i<=max_length+2; i++){
        System.out.print(block);
        
    }
   
            
            
	}
}
