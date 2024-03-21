package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // √ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

    public double distance() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public double distance(Point p) {
        return Math.sqrt((p.getX() - x) * (p.getX() - x) + (p.getY() - y) * (p.getY() - y));
    }

    public double distance(int a, int b){
        return Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
    }

}
