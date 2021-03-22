package pl.zzpj2021.solid.lsp.shape;

public class Square extends Shape {

    private double width;

    public Square(double width) throws NegativeDimensionException{
        setWidth(width);
    }

    @Override
    public double getArea() {
        return width*width;
    }

    @Override
    public double getCircumference() {
        return 4*width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws NegativeDimensionException {
        if(width <=0) {
            throw new NegativeDimensionException();
        }
        this.width = width;
    }
}
