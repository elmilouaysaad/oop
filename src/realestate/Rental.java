package realestate;

import user.*;
import enume.Type;

public interface Rental {
    // Abstract methods for getters and setters
    int getDurationInMonths();
    void setDurationInMonths(int durationInMonths);
    double getPrice();
    void setPrice(double price);
    Type getType();
    void setType(Type type);

    // Abstract method to calculate price
    double calculatePrice();
}
