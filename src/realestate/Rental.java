package realestate;

import user.*;
import enume.Type;

public interface Rental {
    int getDurationInMonths();
    void setDurationInMonths(int durationInMonths);
    double getPrice();
    void setPrice(double price);
    Type getType();
    void setType(Type type);
    double calculatePrice();
}
