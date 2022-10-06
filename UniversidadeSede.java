

public abstract class UniversidadeSede{
    private String nome;
    private String localizacao;

    public UniversidadeSede(String nome,String localizacao){
        this.nome =nome;
        this.localizacao=localizacao;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome=nome;

    }
    public String getLocalizacao(){
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public abstract float calcularMensalidade();
    public String toString(){
        return ("Nome: "+this.nome+"Localizacao:"+this.localizacao);
    }
}