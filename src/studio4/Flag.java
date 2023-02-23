package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(51,204, 255);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
		StdDraw.setPenColor(0,153,76);
		double x []= {0.55, 0.7, 0.85};
		double y [] = {0.95, 0.65, 0.95};
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(255,204,51);
		StdDraw.filledEllipse(.7, .38, 0.2, 0.34);
		StdDraw.setPenColor(204, 229, 255);
		StdDraw.filledEllipse(0.7, 0.24, 0.07, 0.12);
		StdDraw.setPenColor(0,128, 255);
		StdDraw.ellipse(0.7, 0.24, 0.07, 0.12);
		StdDraw.setPenColor(255,255,204);
		StdDraw.filledRectangle(0.5, 0.1, 0.5, 0.1);
		StdDraw.setPenColor(255, 243, 96);
		StdDraw.filledRectangle(0.3, 0.28, 0.05, 0.07);
		StdDraw.setPenColor(180, 122,61);
		StdDraw.filledRectangle(0.3, 0.23, 0.05, 0.02);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(0.28, 0.32, 0.015);
		StdDraw.filledCircle(0.32, 0.32, 0.015);
		StdDraw.filledEllipse(0.3, 0.38, 0.012, 0.03);
		StdDraw.filledEllipse(0.32, 0.353, 0.02, 0.01);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledCircle( 0.28, 0.32, 0.006);
		StdDraw.filledCircle( 0.32, 0.32, 0.006);
		
	}
	
}