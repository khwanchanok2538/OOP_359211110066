package ooplab8;
//Abstract class

public abstract class Shape {
    private int width;
    private int length;

    public abstract double getArea(); //แอฟเทร็กคลาสจะมีหรือไม่มีก็ได้

    public Shape(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}//Shape //รรูปร่าง รูปทรงเลขาคณิต
