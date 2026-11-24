package exercicios.exercicio10;

public class Tercerizado extends  Funcionario{

    private Double despesa;

    public Tercerizado(){
        super( );
    }

    public  Tercerizado(String nome, Integer horas, Double valorPorHora, Double despesa){
        super(nome,horas,valorPorHora);
        this.despesa=despesa;
    }

    public Double getDespesa(){return  despesa;}

    @Override
    public Double pagamento() {
        return (super.pagamento()+(getDespesa()*1.1));
    }
}
