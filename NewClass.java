package Check;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NewClass {

	public static void main(String args[]) {
	List<TargetPortfolio> selectAll= new ArrayList<>();
	Boolean taaFl = true;
	BigDecimal  taaDura = null;
	for(TargetPortfolio tpg: selectAll) {
		BigDecimal draftW = tpg.getCalculatedWeight().add(tpg.getWeight());
		if(null== draftW ||draftW== BigDecimal.ZERO ) {
			continue;
		}else if(null == tpg.getTaaDuration()) {
		taaFl= false;
		break;
		}else {
			taaDura= taaDura.add(tpg.getTaaDuration());
		}
			
	}
	
	}
}
