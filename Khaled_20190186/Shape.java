public abstract class Shape {
    private int color_;
    protected static int RED=1;
    protected static int BLUE=2;
    protected static int GREEN=3;

    Shape (int color) {
        setColor (color);
    }

    public void setColor
            (int color) {
        color_ = color;
    }

    public int getColor () {
        return color_;
    }

    public abstract double getArea ();

}
