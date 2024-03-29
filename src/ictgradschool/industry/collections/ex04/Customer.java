package ictgradschool.industry.collections.ex04;

import java.util.Deque;

/**
 * Someone who eats pancakes.
 */
public class Customer {

    private int bellySize;
    private String name;

    /**
     * Creates a new customer with the given belly size and name.
     *
     * @param bellySize the number of pancakes this person can eat in one sitting
     * @param name the name of the person
     */
    public Customer(int bellySize, String name) {
        this.bellySize = bellySize;
        this.name = name;
    }

    /**
     * Eats from the top of the stack of pancakes until either full or there's no pancakes left.
     *
     * If full, then the method returns successfully. If not, a HungryException is thrown.
     *
     * @param pancakes
     */
    public void eat(Deque<Pancake> pancakes) throws HungryException {

        // TODOne Implement this method. The method logic should be as follows:
        /*
         * While this customer wants to eat more pancakes
         * - Get the top pancake of the stack (LIFO)
         * - If we got a pancake:
         *   - Print out a message saying [customer name] ate [pancake.toString()]!
         *   - Decrease the amount of pancakes we want to eat by one
         * - else:
         *   - Throw a HungryException
         * If we make it to the end without throwing an exception, print out how many pancakes we ate.
         */

        int desiredMealSize = this.bellySize;

        while (desiredMealSize>0) {
            Pancake pancake = pancakes.pollLast();
            if (pancake!=null) {
                System.out.println(name + " ate " + pancake.toString());
                desiredMealSize--;
            }else if(pancake==null && desiredMealSize>0){
                throw new HungryException(this.name + " is still hungry :(");
            }
        }

        System.out.println(this.name + " ate " + this.bellySize + " pancakes");

    }

    public String getName() {
        return name;
    }

    public int getBellySize() {
        return bellySize;
    }
}
