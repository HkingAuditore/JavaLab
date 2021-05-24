package LabThree;

public class RegularHexagon implements ITwoDimensionalShape{
	private double _sideLength;

	public RegularHexagon(double sideLength) {
		this._sideLength = sideLength;
	}

	@Override
	public double getArea() {
		return (3.0/2) * Math.sqrt(3) * getSideLength() * getSideLength();
	}

	@Override
	public double getPerimeter() {
		return 6 * getSideLength();
	}

	@Override
	public ITwoDimensionalShape getShape() {
		return this;
	}


	@Override
	public String toString() {
		return "Regular hexagon's area = " + String.format("%.2f", this.getArea()) + ", perimeter = " + String.format("%.2f", this.getPerimeter());
	}

	//region getter & setter
	public double getSideLength() {
		return _sideLength;
	}

	public void setSideLength(double _sideLength) {
		this._sideLength = _sideLength;
	}
	//endregion
}
