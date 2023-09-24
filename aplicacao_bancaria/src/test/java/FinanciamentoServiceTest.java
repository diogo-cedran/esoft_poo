import org.example.domain.cadastro.ClienteFisico;
import org.example.domain.cadastro.Endereco;
import org.example.domain.cadastro.enums.TipoCliente;
import org.junit.jupiter.api.Test;

public class FinanciamentoServiceTest {

    @Test
    public void testFinanciamentoContaCorrenteFisica() {

        Endereco endereco = new Endereco("Rua Pirapó", "12345", "Zona 7", "Maringa", "PR", "12345-678");

        ClienteFisico cliente = new ClienteFisico("teste123@outlook.com", "43 9896-5078", endereco, "Diogo", "Cedran", "123.456.789-10", "02/09/2004", TipoCliente.FISICO) {
            @Override
            public TipoCliente getEstadoCivilOuTipoSociedade() {
                return null;
            }
        };
    }
}