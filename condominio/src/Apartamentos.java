public class Apartamentos extends Condominio{
    private int id;
    private String andar;
    private int Nquartos;
    private String tipo;
    private String Nplaca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public int getNquartos() {
        return Nquartos;
    }

    public void setNquartos(int nquartos) {
        Nquartos = nquartos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNplaca() {
        return Nplaca;
    }

    public void setNplaca(String nplaca) {
        Nplaca = nplaca;
    }
    public void Imprimir() {
        System.out.println("id"+getId()+"\n"+
                "Número do apartamento"+getNapartamento()+"\n"+
                "Andar"+getAndar()+"\n"+
                "Número de quartos"+getNquartos()+"\n"+
                "Tipo"+getTipo()+"\n"+
                "Número da placa"+getNplaca()+"\n"+);
    }
}
