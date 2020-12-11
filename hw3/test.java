import java.util.*;

abstract class Shape
{
    private List<Double> sides;

    Shape(List <Double> _sides)
    {
        sides = _sides;
    }

    private Double perimeter;

    public Double getperimeter()
    {
        return (perimeter = sides.stream().mapToDouble(Double::doubleValue).sum());
    }

    abstract Double calculateArea();
}

interface RectangleProperties{
    public Boolean isSquare= false;
}

class Rectangle extends Shape implements RectangleProperties
{
    private Double height;
    private Double length;
    private Boolean isSquare;

    Rectangle(Double x1,Double x2)
    {
        super(List.of(x1,x2,x1,x2));
        height = x1;
        length = x2;
    }

    public Boolean getisSquare()
    {
        return (isSquare= (length == height));
    }

    @Override
    public Double calculateArea()
    {
        return height * length;
    }
     
}

class Triangle extends Shape
{
    private Double sideA;
    private Double sideB;
    private Double sideC;

    Triangle(Double x,Double y,Double z)
    {
        super(List.of(x,y,z));
        sideA = x;
        sideB = y;
        sideC = z;       
    }
    
    @Override 
    public Double calculateArea()
    {
        Double s = getperimeter()/2;
        return Math.sqrt(s * (s-sideA) * (s-sideB) * (s-sideC));
    } 
}


class Main{
    public static void main(String[] args) 
    {        
        Triangle tri = new Triangle(3.0,4.0,5.0);
        System.out.println(tri.getperimeter());     
        System.out.println(tri.calculateArea());
        
        Rectangle rect = new Rectangle(5.0, 2.0);
        System.out.println(rect.getperimeter());     
        System.out.println(rect.calculateArea());
    }
}