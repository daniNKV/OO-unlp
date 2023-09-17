package unlp.ar.oo.ejercicio6;

import java.util.List;

public interface LightingGraph {
    void pairWithNeighbor(StreetLight light);
    List<StreetLight> getNeighbors();
}
