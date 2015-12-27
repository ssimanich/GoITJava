package com.ss.M4;

class Area {
    public double TriangleArea(double sideOfTheTriangle, double theHeightOfTheTriangle) {
        return 0.5 * sideOfTheTriangle * theHeightOfTheTriangle;
    }

    public double RectangleArea(double sideOfTheRectangleA, double sideOfTheRectangleB) {
        return sideOfTheRectangleA * sideOfTheRectangleB;
    }

    public double CircleArea(double theRadiusOfTheCircle) {
        return Math.PI * theRadiusOfTheCircle * theRadiusOfTheCircle;
    }
}

