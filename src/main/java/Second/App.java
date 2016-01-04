package Second;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        FIRST_LOOP : for (int i = 0; i < 10; i++){
            System.out.println("Number is " + i);
            if (i == 7){
                continue FIRST_LOOP;
            } else if (i == 8){
                break FIRST_LOOP;
            }
        }
        for (int i=0; i < 10; i++){
            System.out.println("Some " + i +  " changes");
        }


    }
}
