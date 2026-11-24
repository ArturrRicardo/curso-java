package Fundamentos.aula13_Relacionamento_De_Classes.Heranca;

public class Automovel {
    private String modelo;
    private int ano;
    private String cor;

    public Automovel(){;}

    public Automovel(String modelo,int ano,String cor){
        setModelo(modelo);
        setAno(ano);
        setCor(cor);
    }

    public String getModelo(){return modelo;}
    public int getAno(){return ano;}
    public String getCor(){return cor;}

    public void setModelo(String modelo){this.modelo=modelo;}
    public void setAno(int ano ){this.ano=ano;}
    public void setCor(String cor){this.cor=cor;}

    public void acelerar(){
        System.out.println("acelerando o " + getModelo());

    }

    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("modelo: ".toUpperCase());
        sb.append(getModelo());
        sb.append("\n");
        sb.append(" Cor: ".toUpperCase());
        sb.append(getCor());
        sb.append("\n");
        sb.append(" ano: ".toUpperCase());
        sb.append(getAno());
        sb.append("\n");
        String novo=sb.toString();
        return novo;

    }

}
