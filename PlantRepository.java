package Agricultural;

import java.util.ArrayList;

public class PlantRepository {
	
	private ArrayList <Plant> speciesCatalog = new ArrayList <Plant> ();
	
	
	public void toAdd (Plant plant) {
		if(plant != null)
			speciesCatalog.add(plant);
	}
	
	public void toRemove (Plant plant) {
		speciesCatalog.remove(plant);
	}
	
	public boolean exist(Plant plant) {
		if(plant != null)
		{
			for(int i = 0; i < speciesCatalog.size(); i++) {	
				if(speciesCatalog.get(i) == plant )
					return true;
			}
		}
		return false;
	}
	
	public void toList() {
		for(int count = 0; count < speciesCatalog.size(); count++) {
			System.out.println(speciesCatalog.get(count));
		}
	}
	
}

