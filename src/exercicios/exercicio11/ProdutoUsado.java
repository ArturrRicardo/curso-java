package exercicios.exercicio11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {

    private static  final DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dataFabricacao;

    public ProdutoUsado(){super();}

    public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao){
        super(nome,preco);
        this.dataFabricacao=dataFabricacao;
    }

    public LocalDate getDataFabricacao(){return dataFabricacao;}

    @Override
    public String etiqueta (){
        StringBuilder sb = new StringBuilder();
        sb.append(super.etiqueta());
        sb.append(" - ");
        sb.append(" ( Data de fabricação: ");
        sb.append( getDataFabricacao().format(formatado));
        sb.append(" ) ");
        return sb.toString();
    }





}
