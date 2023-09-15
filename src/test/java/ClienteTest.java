import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirContratoPessoaFisica(){
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Física", cliente.emitirContrato());
    }

    @Test
    void deveEmitirDistratoPessoaFisica(){
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Distrato Pessoa Física", cliente.emitirDistrato());
    }

    @Test
    void deveEmitirProcuracaoPessoaFisica(){
        FabricaAbstrata fabrica = new FabricaPessoaFisica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Física", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirContratoPessoaJuridica(){
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Juridica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirDistratoPessoaJuridica(){
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Distrato Pessoa Juridica", cliente.emitirDistrato());
    }

    @Test
    void deveEmitirProcuracaoPessoaJuridica(){
        FabricaAbstrata fabrica = new FabricaPessoaJuridica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Juridica", cliente.emitirProcuracao());
    }

}