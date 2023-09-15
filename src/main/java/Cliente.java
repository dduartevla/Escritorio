public class Cliente {

    private ModeloContrato modeloContrato;
    private ModeloProcuracao modeloProcuracao;
    private ModeloDistrato modeloDistrato;

    public Cliente (FabricaAbstrata fabrica){
        this.modeloContrato = fabrica.createModeloContrato();
        this.modeloDistrato = fabrica.createModeloDistrato();
        this.modeloProcuracao = fabrica.createModeloProcuracao();
    }

    String emitirContrato(){
        return this.modeloContrato.emitir();
    }

    String emitirDistrato(){
        return this.modeloDistrato.emitir();
    }

    String emitirProcuracao(){
        return this.modeloProcuracao.emitir();
    }
}
