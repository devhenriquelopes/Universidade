public class UniversidadeInterior extends UniversidadeSede{
    public float lucro;
    public UniversidadeInterior(String nome,String localizacao){
        super(nome,localizacao);
    }
    public UniversidadeInterior(String nome,String localizacao, float lucro){
        super(nome, localizacao);
        this.lucro=lucro;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    @Override
    public float calcularMensalidade() {
        return 12500/80;
    }
    public String toString(){
        return (super.toString()+"lucro:"+this.lucro);

    }
}
