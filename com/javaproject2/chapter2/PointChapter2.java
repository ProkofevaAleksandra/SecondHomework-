package com.javaproject2.chapter2;

public class PointChapter2 {
        private double x = 0;
        private double y = 0;

        public PointChapter2(double v) {
        }

        public PointChapter2(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "( " + x + " , " + y + ")";
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public PointChapter2 translate(double xDelta, double yDelta) {
            return new PointChapter2(this.x + xDelta, this.y + yDelta);
        }

        public PointChapter2 scale(double coefficient) {
            return new PointChapter2(this.x * coefficient, this.y * coefficient);
        }
    }

