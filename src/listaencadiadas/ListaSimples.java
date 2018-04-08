package listaencadiadas;

public class ListaSimples {
    private NoSimples primeiro;
    private NoSimples ultimo;
    
    public ListaSimples(){
        this.primeiro = null;
        this.ultimo = null;
    }
    
    public void inserirPrimeiro(NoSimples p){
        NoSimples novoNo = p;
        if(this.evazia()){
            this.ultimo = novoNo;
        }
        novoNo.setProx(this.primeiro);
        this.primeiro = novoNo;
    }
    public boolean evazia(){
        return (this.primeiro == null);
    }
    
    public void inserirUltimo(NoSimples p){
        NoSimples novoNo = p;
        if(this.evazia()){
            this.primeiro = novoNo;
        }
        else{
            this.ultimo.setProx(novoNo);
        }
        this.ultimo = novoNo;
    }
    
    public String exibirLista(){
        String msg = "";
        if(evazia()){
            msg = "A lista está vazia";
        }else{
            NoSimples atual = this.primeiro;
            while(atual != null){
                msg = msg + atual.getNome() + " | ";
                msg = msg + atual.getSexo() + " | ";
                msg = msg + atual.getIdade() + " | ---> " ;
                atual = atual.getProx();
            }
        }
        return msg;
    }
}
