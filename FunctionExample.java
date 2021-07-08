public class FunctionExample { 
    
    /* Definicion de la funcion square */
    public static int square( int i ) { 
        return i*i; 
    } 
    
    public static void main( String[] args ) { 
        for( int i=1; i<=10; i++ ) { 
            System.out.println( "i=" + i + ", i*i=" + square( i ) /*invocacion de la funcion*/ ); 
        } 
    } 
} 
