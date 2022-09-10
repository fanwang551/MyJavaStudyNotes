package com.company.day8_9_8.test05;

public class Point {
    private double axis_x;
    private double axis_y;

    public Point(double axis_x, double axis_y) {
        this.axis_x = axis_x;
        this.axis_y = axis_y;
    }

    public Point() {
    }

    public double getAxis_x() {
        return axis_x;
    }

    public void setAxis_x(double axis_x) {
        this.axis_x = axis_x;
    }

    public double getAxis_y() {
        return axis_y;
    }

    public void setAxis_y(double axis_y) {
        this.axis_y = axis_y;
    }
}
