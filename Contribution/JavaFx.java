package com.nth.test;

import com.sun.javafx.geom.Rectangle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.RectangleBuilder;
import javafx.stage.Stage;

public class JavaFx extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 800, 600, Color.WHITE);

		

		javafx.scene.shape.Rectangle rectSample = RectangleBuilder.create().x(100).y(100).width(200).fill(Color.BLUEVIOLET).height(200).build();

		root.getChildren().add(rectSample);

		arg0.setScene(scene);
		arg0.show();

	}

}
