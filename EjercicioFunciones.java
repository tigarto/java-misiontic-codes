public class EjercicioFunciones { 
    
    public static int square( int n ) { 
        return n*n; 
    } 
    public static int cube( int n ) { 
        return n*n*n; 
    } 
 
    public static int toThePower( int n, int power ) { 
        int result=n; 
        for( int i=0; i<power; i++ ) { 
            result *= n; 
        } 
        return result; 
    } 

    public static int factorial( int n ) { 
        int result = n; 
        for( int i=n-1; i>0; i-- ) { 
            result *= i; 
        } 
        return result; 
    } 
     
    public static void showNumber( String operation, int n ) { 
        System.out.println( "The result of the " + operation + " is " + n );  
    } 
    
    public static void main( String[] args ) { 
        int a = 5;
        showNumber( "Square", square( a ) ); 
        showNumber( "Cube", cube( a ) ); 
        showNumber( "To The Power", toThePower( a, 4 ) ); 
        showNumber( "Factorial", factorial( a ) ); 
    } 
} 
