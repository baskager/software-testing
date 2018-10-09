package io.kager.shapes;

public class Rechthoek implements Shapeable {
	protected int lengte;
	protected int breedte;
	
	public int getLengte() {
		return this.lengte;
	}
	
	public int getBreedte() {
		return this.breedte;
	}
	
	public int getOppervlakte() {
		return this.lengte * this.breedte;
	}
	
	public void setBreedte(int breedte) {
		this.breedte = breedte;
	}
	
	public void setLengte(int lengte) {
		this.lengte = lengte;
	}
}
