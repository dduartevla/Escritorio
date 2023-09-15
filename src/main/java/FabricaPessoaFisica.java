public class FabricaPessoaFisica implements FabricaAbstrata{

    @Override
    public ModeloContrato createModeloContrato(){
        return new ModeloContratoPessoaFisica ();
    }
    @Override
    public ModeloDistrato createModeloDistrato(){
        return new ModeloDistratoPessoaFisica ();
    }

    public ModeloProcuracao createModeloProcuracao(){
        return new ModeloProcuracaoPessoaFisica ();
    }
}
