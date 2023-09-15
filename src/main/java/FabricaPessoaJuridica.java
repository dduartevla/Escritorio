public class FabricaPessoaJuridica implements FabricaAbstrata{

    @Override
    public ModeloContrato createModeloContrato(){
        return new ModeloContratoPessoaJuridica();
    }
    @Override
    public ModeloDistrato createModeloDistrato(){
        return new ModeloDistratoPessoaJuridica();
    }

    public ModeloProcuracao createModeloProcuracao(){
        return new ModeloProcuracaoPessoaJuridica();
    }
}
