package collectionstreamsandfilters;

import java.io.*;
class LastError<T> {
     private T lastError;
     void setError(T t){
         lastError = t;
         System.out.println("LastError: setError");
     }
}
class StrLastError<S extends CharSequence> extends LastError<String>{
     public StrLastError(S s) {
     }
     void setError(S s){
        System.out.println("StrLastError: setError");
     }
}
class Test {
     public static void main(String []args) {
        StrLastError<String> err = new StrLastError<String>("Error");
        
      //reference to setError is ambiguous, both method setError(T)
        //in LastError and method setError(S) in StrLastError match
        //err.setError("Last error");
        
        //err.setError("Last error"); 
        
     }
}