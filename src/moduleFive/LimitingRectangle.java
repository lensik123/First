package moduleFive;

public class LimitingRectangle {
	private int[][] points ;

	private int minY, minX, maxY, maxX;

	public LimitingRectangle(int[][] points) {
		this.points = points;
		minMax();
	}

	public void minMax(){
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {

				minX = Math.min(points[i][0], minX);
				maxX = Math.max(points[i][0], maxX);

				minY = Math.min(points[i][1], minY);
				maxY = Math.max(points[i][1], maxY);

			}
		}
	}

	public int getWidth(){
		int width = Math.abs(maxX) + Math.abs(minX);
		return width;
	}

	public int getHeight(){
		int Height = Math.abs(maxY) + Math.abs(minY);
		return Height;
	}

	public String getBorders(){
		String concatenatedString = String.valueOf(minY) + " " + String.valueOf(maxY) + " " + String.valueOf(minX) + " " + String.valueOf(maxX);
		return concatenatedString;
	}
}
