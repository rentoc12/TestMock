package service;

import dao.ClienteDao;
import dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();

    }

    public String salvar() {
        return "Sucesso";
    }

    public String buscar() {
        return "Busca realizada";
    }

    public String excluir() {
        return "Excluído";
    }

    public String atualizar() {
        return "Atualizado com sucesso";
    }
}
