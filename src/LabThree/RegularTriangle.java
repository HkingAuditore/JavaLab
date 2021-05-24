package LabThree;

public class RegularTriangle implements ITwoDimensionalShape{
	private double _sideLength;

	public RegularTriangle(double sideLength) {
		this._sideLength = sideLength;
	}

	@Override
	public double getArea() {
		return Math.sqrt(3) * getSideLength() * getSideLength() *.25;
	}

	@Override
	public double getPerimeter() {
		return getSideLength() * 3;
	}

	@Override
	public ITwoDimensionalShape getShape() {
		return this;
	}


	@Override
	public String toString() {
		return "Regular triangle's area = " + String.format("%.2f", this.getArea()) + ", perimeter = "
			   + String.format("%.2f", this.getPerimeter());
	}

	//region getter & setter
	public double getSideLength() {
		return _sideLength;
	}

	public void setSideLength(double sideLength) {
		this._sideLength = sideLength;
	}
	//endregion
}
