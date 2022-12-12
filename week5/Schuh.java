package myPackage;

public class Schuh implements SchuhInfo {
	private String model;
	private Material material;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	@Override
	public Material schuhInfo() {
		return material;
	}
}
