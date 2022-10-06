

public class UniversidadePolo extends UniversidadeSede {
    private String qtdAlunos;


    public UniversidadePolo(String nome, String localizacao) {
        super(nome,localizacao);

    }

    public UniversidadePolo(String nome, String localizacao, String qtdAlunos) {
        super(nome, localizacao);
        this.qtdAlunos = qtdAlunos;
    }

    public String getQtdAlunos() {
        return qtdAlunos;

    }

    public void setLocalizacao(String localizacao) {
        this.qtdAlunos = qtdAlunos;
    }

    @Override
    public float calcularMensalidade() {
        return 0;
    }

    public float calculaMensalidade() {
        return 12500/100;
    }

    public String toString(){
        return (super.toString()+"Quantidade de Alunos: "+this.qtdAlunos);

    }
}


