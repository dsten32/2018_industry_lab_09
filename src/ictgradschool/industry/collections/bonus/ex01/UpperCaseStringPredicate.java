package ictgradschool.industry.collections.bonus.ex01;

/**
 * Created by Andrew Meads on 25/03/2017.
 */
public class UpperCaseStringPredicate implements IPredicate<String>  {

    /**
     * Tests whether the given object is a String that's completely upper-case.
     *
     * @param obj the object to test
     * @return true if the object is a String that's all upper-case, false otherwise.
     * @throws ClassCastException if the given object is not a String.
     */
    @Override
    public boolean test(String obj) {
//        String s = (String) obj;
        String upperCase = obj.toUpperCase();
        return obj.equals(upperCase);
    }
}
