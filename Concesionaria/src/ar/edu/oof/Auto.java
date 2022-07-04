package ar.edu.oof;

public class Auto {
	private Integer id;
	private String marca;

	public Auto(Integer id, String marca) {
		super();
		this.id = id;
		this.marca = marca;
	}

	public Integer getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
