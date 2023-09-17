package unlp.ar.oo.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class StreetLight implements Lamp, LightingGraph {
    List<StreetLight> neighbors;
    Boolean isOn;

    public StreetLight() {
        this.neighbors = new ArrayList<>();
        this.isOn = false;
    }
    @Override
    public void pairWithNeighbor(StreetLight light) {
        if (!neighbors.contains(light)) {
            this.neighbors.add(light);
            light.pairWithNeighbor(this);
        }
    }

    @Override
    public List<StreetLight> getNeighbors() {
        return neighbors;
    }

    @Override
    public Boolean isOn() {
        return isOn;
    }

    @Override
    public void turnOn() {
        if (!this.isOn()) {
            this.isOn = true;
            this.getNeighbors().forEach(StreetLight::turnOn);
        }
    }

    @Override
    public void turnOff() {
        if (this.isOn()) {
            this.isOn = false;
            this.getNeighbors().forEach(StreetLight::turnOff);
        }
    }
}
