package pl.zzpj2021.solid.lsp.shape;

public class Circle extends Shape {

    private double radius;

    public Circle (double radius) throws NegativeDimensionException {
        setRadius(radius);
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws NegativeDimensionException {
        if(radius <= 0) {
            throw new NegativeDimensionException();
        }
        this.radius = radius;
    }
}
