package exercicios.exercicio11;

public class ProdutoImportado extends Produto{
    private Double custo;

    public ProdutoImportado(){super();}

    public ProdutoImportado(String nome,Double preco,Double custo){
        super(nome,preco);
        this.custo=custo;
    }

    public Double getCusto(){return custo;}

    @Override
    public String etiqueta (){
        StringBuilder sb = new StringBuilder();
        sb.append(getNome());
        sb.append( " - ");
        sb.append(" R$");
        sb.append(String.format("%.2f",getPreco()+ getCusto()));
        sb.append(" - ");
        sb.append(" ( Custo de importação: ");
        sb.append(String.format("%.2f", getCusto()));
        sb.append(" )");
        return sb.toString();
    }
}
