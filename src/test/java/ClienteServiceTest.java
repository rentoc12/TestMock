import dao.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.ClienteService;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDaoMock clienteMock = new ClienteDaoMock();
        ClienteService service = new ClienteService(clienteMock);
        String retorna = service.salvar();
        Assert.assertEquals("Sucesso", retorna);
    }
    @Test
    public void buscarTest() {
        ClienteDaoMock clienteMock = new ClienteDaoMock();
        ClienteService service = new ClienteService(clienteMock);
        String retorna = service.buscar();
        Assert.assertEquals("Busca realizada", retorna);
    }

    @Test
    public void excluirTest() {
        ClienteDaoMock clienteMock = new ClienteDaoMock();
        ClienteService service = new ClienteService(clienteMock);
        String retorna = service.excluir();
        Assert.assertEquals("Excluído", retorna);
    }

    @Test
    public void atualizarTest() {
        ClienteDaoMock clienteMock = new ClienteDaoMock();
        ClienteService service = new ClienteService(clienteMock);
        String retorna = service.atualizar();
        Assert.assertEquals("Atualizado com sucesso", retorna);
    }
}
