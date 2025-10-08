package dao;

public class ClienteDaoMock implements IClienteDao{
    @Override
    public String salvar() {
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return "Busca realizada";
    }

    @Override
    public String excluir() {
        return "Excluído";
    }

    @Override
    public String atualizar() {
        return "Atualizado com sucesso";
    }
}
