package four.br.com.mcoder.services;

import four.br.com.mcoder.entities.Carro;

public interface ICarroService {

    public void novoCarro(Carro carro);

    public void alterarCarro(Carro carro);

    public void excluirCarro(String modelo);



}
