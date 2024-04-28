package realestate;
import java.util.Comparator;

import enume.Type;

public class RealEstateTypeComparator implements Comparator<RealEstate> {
    @Override
    public int compare(RealEstate property1, RealEstate property2) {
        Type[] priority = {Type.Villa, Type.Commercial, Type.Studio, Type.Apartment};
        
        int index1 = getTypePriorityIndex(property1.getType(), priority);
        int index2 = getTypePriorityIndex(property2.getType(), priority);
        
        return Integer.compare(index1, index2);
    }
    
    private int getTypePriorityIndex(Type type, Type[] priority) {
        for (int i = 0; i <priority.length; i++) {
            if (type == priority[i]) {
                return i;
            }
        }
        return priority.length;
    }
}
