package dao;

public class ClienteDao implements IClienteDao {

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
