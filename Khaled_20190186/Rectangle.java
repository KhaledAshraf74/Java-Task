public class Rectangle  extends Shape {
    private double length_, width_;

    Rectangle (double length, double width, int color) {
        super (color);
        length_ = length;
        width_  = width;
    }

    public double getArea () {
        return length_ * width_;
    }

    @Override
    public String toString() {
        return length_+" "+width_+" "+getColor();
    }
}
