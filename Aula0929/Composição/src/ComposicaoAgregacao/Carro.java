package ComposicaoAgregacao;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private List<Passageiro> passageiros = new ArrayList<Passageiro>();

    private List<Motor> motors = new ArrayList<Motor>();

    public Carro(){
        
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

}
