package WhileLoop;

import java.util.Random;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class whileloop {
    public static void main(String[] args){

        Random random = new Random();
        boolean isFinished = false;

    while (isFinished) {
        int randomValue = random.nextInt(bound 100);
        System.out.print("Hello" + randomValue);

        if (randomValue > 90){
            isFinished-true;
        }
    }

    System.out.print("finished");
    }

}
