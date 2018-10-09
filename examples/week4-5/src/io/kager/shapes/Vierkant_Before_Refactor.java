package io.kager.shapes;

public class Vierkant_Before_Refactor extends Rechthoek {
	public void setBreedte(int breedte) {
		this.breedte = breedte;
		this.lengte = breedte;
	}
	
	public void setLengte(int lengte) {
		this.lengte = lengte;
		this.breedte = lengte;
	}
}
