package io.kager.shapes;

public class Vierkant implements Shapeable{
	private int zijdes;
	
	public int getZijdes() {
		return zijdes;
	}
	
	public void setZijdes(int zijdes) throws IllegalArgumentException {
		if(zijdes < 1) throw new IllegalArgumentException("Zijdes cannot be zero");
		this.zijdes = zijdes;
	}
	
	public int getOppervlakte() {
		return this.zijdes * this.zijdes;
	}
}
