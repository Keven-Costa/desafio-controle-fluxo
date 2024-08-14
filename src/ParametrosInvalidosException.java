public class ParametrosInvalidosException extends Throwable {
    private int parametroUm;
    private int parametroDois;

    public int getParametroUm() {
        return parametroUm;
    }

    public void setParametroUm(int parametroUm) {
        this.parametroUm = parametroUm;
    }

    public int getParametroDois() {
        return parametroDois;
    }

    public void setParametroDois(int parametroDois) {
        this.parametroDois = parametroDois;
    }

    void verificarParametros (int parametroUm, int parametroDois) {
        if (parametroUm > parametroDois) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
