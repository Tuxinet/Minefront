package com.tuxinet.minefront.graphics;

import com.tuxinet.minefront.Game;

public class Render3D extends Render {

	public Render3D(int width, int height) {
		super(width, height);
	}

	public void floor(Game game) {

		double floorPosition = 8;
		double ceilingPosition = 8;
		double zMove = game.controls.z;
		double xMove = game.controls.x;

		double rotation = game.controls.rotation;
		double cosine = Math.cos(rotation);
		double sine = Math.sin(rotation);

		for (int y = 0; y < height; y++) {
			double ceiling = (y + -height / 2.0) / height;

			double z = floorPosition / ceiling;

			if (ceiling < 0) {
				z = ceilingPosition / -ceiling;
			}

			for (int x = 0; x < width; x++) {
				double depth = (x - width / 2.0) / height;
				depth *= z;
				double xx = depth * cosine + z * sine;
				double yy = z * cosine - depth * sine;
				int xPix = (int) (xx + xMove);
				int yPix = (int) (yy + zMove);
				pixels[x + y * width] = ((xPix & 15) * 16) | ((yPix & 15) * 16) << 8;
			}
		}
	}

}
