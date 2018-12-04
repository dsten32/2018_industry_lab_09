package ictgradschool.industry.collections.bonus.ex02;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Andrew Meads on 25/03/2017.
 */
public class ShapeBox {

    private List<Shape> storage;

    public ShapeBox() {
        this.storage = new LinkedList<>();
    }

    /**
     * Adds a single shape to this box.
     */
    public void addShape(Shape shape) {
        storage.add(shape);
    }

    /**
     * Adds all the shapes in the given list to this box.
     *
     * TODO modify the method signature so that things like Lists of Rectangles and Lists of Circles can be added, rather than just Lists of Shapes.
     * @param shapes the shapes to add
     */
    public <T> void addShapes(List<T> shapes) {

        storage.addAll((Collection<? extends Shape>) shapes);
    }

    public double getTotalPerimeter() {

        // TODO Use a normal for-loop to add up the perimeter of all shapes in the list, and return the sum.
        // HINT: A single shape's perimeter can be obtained using the getPerimeter() method.
        double tot=0;
        for (int i = 0; i < storage.size(); i++) {
            tot+=storage.get(i).getPerimeter();
        }

        return tot;
    }

    public double getTotalArea() {

        // TODOne Use an enhanced for-loop to add up the area of all shapes in the list, and return the sum.
        // HINT: A single shape's area can be obtained using the getArea() method.
        double area=0;
        for (Shape a :storage
             ) {
            area+=a.getArea();
        }

        return area;
    }

    @Override
    public String toString() {

        // This formatter can be used to format numbers to 2DP when converting them to Strings
        NumberFormat twoDPFormat = new DecimalFormat("#.##");

        // TODOne Set numShapes to the size of the storage list.
        int numShapes = storage.size();

        String info = "ShapeBox [numShapes=" +numShapes +
                ", totalArea=" + twoDPFormat.format(getTotalArea()) +
                ", totalPerimeter=" + twoDPFormat.format(getTotalPerimeter()) +
                ", storage= [\n";

        // TODO Use an iterator to loop through all shapes in the list, and add their information to the info string.
        // HINT: Info about a shape can be obtained using its toString() method.
        Iterator<Shape> iterbox = storage.iterator();
        while (iterbox.hasNext()){
            Shape a = iterbox.next();
            info+=a.toString();
        }


        info += "]]";

        return info;
    }
}
