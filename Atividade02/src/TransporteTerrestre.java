
public class TransporteTerrestre extends Transportadora {

    @Override
    public double calculaFrete(int altura, int largura) {
        return 0.2 * (altura / (double)largura);
    }
}
