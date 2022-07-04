package ar.edu.oof;

import java.util.ArrayList;
import java.util.List;

public class Concesionaria {
	private List<Auto> autos = new ArrayList<>();

	public void agregarAuto(Auto auto) {
		autos.add(auto);
	}

	public Auto buscarAutoPorId(Integer id) throws AutoNoEncontradoException{

		for (Auto auto : autos) {
			if (auto.getId().equals(id)) {
				return auto;
			}
		}
		throw new AutoNoEncontradoException("El auto no se encontro");
	}

	public List<Auto> getAutos() {
		return autos;
	}

	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}
	
	
}
