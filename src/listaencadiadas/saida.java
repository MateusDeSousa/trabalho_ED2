package listaencadiadas;

import java.util.Scanner;

public class saida
{ 
    public static char menu(){
        String msg;
        System.out.println("-------------------------------------\n" +
                           "= Escolha uma opção =\n" +
                           "-------------------------------------\n" +
                           "= 1. Inserir no inicio\n" +
                           "= 2. Inserir no final\n" +
                           "= 3. Imprimir a lista\n" +
                           "= 4. Sair do programa\n" +
                           "-------------------------------------\n");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ListaSimples lista = new ListaSimples();
        char opcao;
        
        do{
            opcao = menu();
            switch(opcao){
                case '1':
                    NoSimples pi = new NoSimples();
                    System.out.println("------Inserir no inicio------\n" + "Nome: ");
                    pi.setNome(ler.next());
                    while((pi.getSexo() != 'M') || (pi.getSexo() != 'F') || (pi.getSexo() != 'm') || (pi.getSexo() != 'f')){
                        System.out.println("Sexo(Digite M ou F): ");
                        pi.setSexo(ler.next().charAt(0));
                        if((pi.getSexo() == 'M') || (pi.getSexo() == 'F') || (pi.getSexo() == 'm') || (pi.getSexo() == 'f')){
                            break;
                        }
                    }        
                    System.out.println("Idade: ");
                    pi.setIdade(ler.nextInt());
                    while(pi.getIdade() < 1){
                        System.out.println("Digite uma idade valida");
                        pi.setIdade(ler.nextInt());
                    }
                    lista.inserirPrimeiro(pi);
                    System.out.println("-----------Pessoa cadastrada com sucesso!!!-----------\n" + "");
                    break;
                case '2':
                    NoSimples pf = new NoSimples();
                    System.out.println("------Inserir no final------\n" + "Nome: ");
                    pf.setNome(ler.next());
                    while((pf.getSexo() != 'M') || (pf.getSexo() != 'F') || (pf.getSexo() != 'm') || (pf.getSexo() != 'f')){
                        System.out.println("Sexo(Digite M ou F): ");
                        pf.setSexo(ler.next().charAt(0));
                        if((pf.getSexo() == 'M') || (pf.getSexo() == 'F') || (pf.getSexo() == 'm') || (pf.getSexo() == 'f')){
                            break;
                        }
                    }        
                    System.out.println("Idade: ");
                    pf.setIdade(ler.nextInt());
                    while(pf.getIdade() < 1){
                        System.out.println("Digite uma idade valida");
                        pf.setIdade(ler.nextInt());
                    }
                    lista.inserirUltimo(pf);
                    System.out.println("---------Pessoa cadastrada com sucesso!!!---------\n" + "");
                    break;
      
                case '3':
                    System.out.println("-------------------------------------\n" +
                    "Lista: " + lista.exibirLista() + "\n" +
                    "-------------------------------------\n");
                    break;
           
                case '4':
                    System.out.println("Fim do programa!!!");
                    break;
                    
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
            
        }while (opcao != '4');
        System.exit(0);
    }

}