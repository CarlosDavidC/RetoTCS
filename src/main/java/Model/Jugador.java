package Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Jugador {
    public String name;
    public int creditosTotales;
    public int creditosApostados;
    public int caballo;
}
