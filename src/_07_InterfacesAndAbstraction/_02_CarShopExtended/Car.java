package _07_InterfacesAndAbstraction._02_CarShopExtended;

import java.io.Serializable;

public interface Car {
    int TIRES = 4;

    public String getModel();
    public String getColor();
    public Integer getHorsePower();
    public String countryProduced();
}
