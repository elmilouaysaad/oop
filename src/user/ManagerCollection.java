package user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagerCollection {
    private List<Manager> managers;

    public ManagerCollection() {
        managers = new ArrayList<>();
    }

    public void addManager(Manager manager) {
        managers.add(manager);
    }

    public void removeManager(Manager manager) {
        managers.remove(manager);
    }

    public void displayManagers() {
        Collections.sort(managers, Comparator.comparing(Manager::getName));
        for (Manager manager : managers) {
            manager.displayInformation();
        }
    }
}