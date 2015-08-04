package circle;

/**
 * Created by ������� on 03.08.2015.
 * ����� ����������!!!
 */
public class Circle {
    private int x;
    private int y;
    private int radius;

    public Circle(){
        // ����������� �� ���������, ���������� ������������� ���������������� ������.
    }
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(Circle newCircle){
        this.x = newCircle.x;
        this.y = newCircle.y;
        this.radius = newCircle.radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void moveTheCircle(int dx, int dy){
        x += dx;
        y += dy;
    }

    public boolean pointIsHit(int x, int y){
        // �� ������� ��������� ���������� �� ������ ���������� �� �����
        double a = Math.pow((x - this.x),2);
        double b = Math.pow((y - this.y),2);
        double distanceToPoint = Math.sqrt(a+b);
        // ���� ���������� �� ������ ���������� �� ����� ������ (���� �����) ������� ����������,
        // �� ����� ������ � ����������!!!
        if (distanceToPoint <= radius)
            return true;
        else return false;
    }

    public boolean circleIsInside(Circle smallCircle){
        // �� ������� ��������� ���������� �� ������� �����������
        double a = Math.pow((smallCircle.x - this.x),2);
        double b = Math.pow((smallCircle.y - this.y),2);
        double distanceFromCenter = Math.sqrt(a+b);
        // ���� ���������� �� ������� ����������� + ������ ����� ����������
        // ������ (���� �����) ������� ������� ����������, �� ����� ���������� �������� �������� � ������� ����������!!!
        if ((distanceFromCenter + smallCircle.radius) <= this.radius)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Circle {coordinates of the center " + "x=" + x + ", y=" + y + "; radius=" + radius + '}';
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Circle))
            return false;
        Circle circle = (Circle) obj;
        if (this.x != circle.x)
            return false;
        if (this.y != circle.y)
            return false;
        if (this.radius != circle.radius)
            return false;
        return true;
    }

    @Override
    public int hashCode(){
        final int PRIME = 41;
        int result = 15;
        result = PRIME*result + x;
        result = PRIME*result + y;
        result = PRIME*result + radius;
        return result;
    }
}
