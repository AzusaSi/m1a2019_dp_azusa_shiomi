public interface Shape {

    public abstract int getShape();
    public abstract void setShape(int sha);

    Shape createShape();
    void move(int dX, int dY);
}
