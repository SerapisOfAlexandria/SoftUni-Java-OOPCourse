package _07_InterfacesAndAbstraction._01_CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    public final static int TIRES = 4;

    public String getModel();
    public String getColor();
    public Integer getHorsePower();
    public String countryProduced();
}
