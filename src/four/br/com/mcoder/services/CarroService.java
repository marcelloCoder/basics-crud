package four.br.com.mcoder.services;

import four.br.com.mcoder.entities.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroService implements ICarroService{

    List<Carro> carroList = new ArrayList<>();
    @Override
    public void novoCarro(Carro carro) {
        if(carro != null){
            carroList.add(carro);
        }
    }

    @Override
    public void alterarCarro(Carro carro) {

    }

    @Override
    public void excluirCarro(String modelo) {

    }
}
