package pl.zzpj2021.solid.lsp.shape;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) throws NegativeDimensionException {
        setHeight(height);
        setWidth(width);
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getCircumference() {
        return (2*width)+(2*height);
    }

    public void setWidth(double width) throws NegativeDimensionException {
        if(width <= 0){
            throw new NegativeDimensionException();
        }
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) throws NegativeDimensionException {
        if(height <= 0) {
            throw new NegativeDimensionException();
        }
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
}
