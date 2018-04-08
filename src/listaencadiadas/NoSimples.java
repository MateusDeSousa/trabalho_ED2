package listaencadiadas;

public class NoSimples {
    private String nome;
    private int idade;
    private char sexo;
    private NoSimples prox;
    
    public NoSimples(){
        this.prox = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char s) {
        this.sexo = s;
                
    }

    public NoSimples getProx() {
        return prox;
    }

    public void setProx(NoSimples prox) {
        this.prox = prox;
    }
    
    
}
