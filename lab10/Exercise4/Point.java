package lab10.Exercise4;

class Point {
    int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point getXY() {
        return new Point(x, y);
    }
}
