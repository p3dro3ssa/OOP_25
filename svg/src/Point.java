public class Point {
    private double x;
    private double y;

    //getter
    public double getX(){
        return x;
    }
    //setter
    public void setX(double x){
        this.x=x;
    }
    @Override
    public String toString(){
        return "("+x+" , "+y+")";
    }
    public String toSvg()
    {
        return "<circle r=\"5\" cx=\""+x+"\" cy=\""+y+"\" fill=\"black\" />";
    }
    public void translate(double dx, double dy)
    {
        x+=dx;
        this.y+=dy;
    }
    public Point translated(double dx, double dy)
    {
        Point newPoint = new Point();
        newPoint.x = x + dx;
        newPoint.y = y + dy;
        return newPoint;
    }
}