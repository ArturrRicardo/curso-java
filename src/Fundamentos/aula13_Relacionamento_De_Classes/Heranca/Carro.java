package Fundamentos.aula13_Relacionamento_De_Classes.Heranca;

public class Carro extends  Automovel{  // aqui a classe carro herda os atributos e metodos da classe automovel

    private double motor;
    private int portas;

    public Carro(){
        super();
    }

    public Carro(String modelo, int ano, String cor, double motor,int portas){
        super(modelo, ano, cor);
        this.motor=motor;
        this.portas=portas;
    }

    //aqui no construtor passamos os atributos da classe mae como parametros
    // e aqui entregamos no super os valores passados para os atributos da classe mae
    // o super manda os atributos para o construtor da classe mae para ele guardar cada informação no seu devido lugar
    // o super e refere a mae
    // o super é o atalho para usar o que é da mae
    // O SUPER SO EXISTE DENTRO DA HERANÇA NAO PODE SER USADO EM CODIGOS QUE NAO TEM HERANÇA

    public double getMotor(){return motor;}
    public int getPortas(){return portas;}

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("motor: ".toUpperCase());
        sb.append(getMotor());
        sb.append("\n");
        sb.append(" portas: ".toUpperCase());
        sb.append(getPortas());
        sb.append("\n ----------------------------------------------------------------------------------------------");
        String n=sb.toString();
        return n;

    }

    @Override
    public void acelerar() {
        super.acelerar();
        if(getMotor()==1.0){
            System.out.println("estamos a 60km/h".toUpperCase());
        } else if (getMotor()==1.6) {
            System.out.println("estamos a 100km/h".toUpperCase());
        } else if (getMotor()==2.0) {
            System.out.println("estamos a 120km/h".toUpperCase());
        }
    }

    // aqui estamos sobreescrvendo o metodo da classe mae adicionando mais detalhes na classe filha

    public static void main(String[] args) {
        Carro c1 = new Carro("polo",2005,"prata",1.6,4);
        System.out.println(c1);
        c1.acelerar();
    }


}
