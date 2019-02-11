 

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // assume there is a `counter`
          int count = 0;
          Person currentP;
        // while `counter` is less than length of array
         while ( count < personArray.length ) {
            currentP = personArray[count];
            String stringRepresentation = currentP.toString();
            result += stringRepresentation;
            count++;
            }  
        // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
            int count = 0;
            Person currentP;
        for(int i = 0; i < personArray.length; i++ ){
               currentP=personArray[count];
               String stringRepresentation = currentP.toString();
               result +=stringRepresentation;
               count++;
            }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        
        // identify array's type
        String newString= "";
        
        //identify array's variable-name
        
         for(Person  currentP : personArray ){
              
             
             currentP.toString(); 
             newString+= currentP;
             
             
                
              
              
            }
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return newString;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
