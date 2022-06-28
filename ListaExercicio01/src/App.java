import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import classes.Contato;
import classes.Livro;
import estruturas.Lista;
import estruturas.Pilha;

public class App {
    
    public static void main(String[] args) {
        //Exercucui 01
/*         Lista<String> lista = new Lista<>(10);
        lista.adiciona("A");
        lista.adiciona("B");
        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("C")); */

        //Exercicio 02
/*         Lista<String> lista = new Lista<>(10);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");
        System.out.println("ultima o ocorrência do A " + lista.ultimaOcorrencia("A"));
        System.out.println("ultima o ocorrência do B " + lista.ultimaOcorrencia("B"));
        System.out.println("ultima ocorrência do C " + lista.ultimaOcorrencia("C")); */

        //Exercicio 03
/*         Lista<String> lista = new Lista<>(10);
        lista.adiciona("A");
        lista.adiciona("B");
        try {
            lista.removeUltimo();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(lista); */

        //Exercicio 04
/*         Lista<String> lista = new Lista<>(10);
        lista.adiciona("A");
        lista.adiciona("B");
        try {
            lista.removePrimeiro();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(lista); */

        //Exercicio 05
/*         Lista<String> lista =new Lista<>(10);
        lista.adiciona("A");
        lista.adiciona("B");
        System.out.println(lista);
        lista.limpar();
        System.out.println(lista); */

        //Exercicio 06
/*         Lista<Contato> lista = new Lista<>(20);
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            System.out.println("Nome: ");
            String nome = entrada.next();
            System.out.println("Telefone: ");
            String telefone = entrada.next();
            System.out.println("Email: ");
            String email = entrada.next();
            Contato c = new Contato(nome, telefone, email);
            lista.adiciona(c);
        }
        System.out.println(lista); */

        //Exericico 07
/*             LinkedList<Contato> lista = new LinkedList<>();
            Scanner entrada = new Scanner(System.in);
            for (int i = 0; i < 2; i++) {
                System.out.println("Nome: ");
                String nome = entrada.next();
                System.out.println("Telefone: ");
                String telefone = entrada.next();
                System.out.println("Email: ");
                String email = entrada.next();
                Contato c = new Contato(nome, telefone, email);
                lista.add(c);
            }
            System.out.println(lista); */

        //Exercicio 08
/*         Pilha<Integer> pilha = new Pilha<>();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero inteiro: ");
            int numero = entrada.nextInt();
            if(numero % 2 == 0){
                pilha.empilhar(numero);
            }else{
                if(pilha.estaVazia()){
                    System.out.println("Pilha está vazia");
                }else{
                    pilha.desempilhar();
                }
            }
        }
        while (!pilha.estaVazia()){
            System.out.println(pilha.desempilhar());
        }            
     */

        //Exercicio 09
/*         Pilha<Integer> pilhaPar = new Pilha<>();
        Pilha<Integer> pilhaImpar = new Pilha<>();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero inteiro: ");
            int numero = entrada.nextInt();
            if(numero == 0) {
                if (pilhaPar.estaVazia()) {
                    System.out.println("Pilha dos números pares vazia");
                } else {
                    pilhaPar.desempilhar();
                }

                if (pilhaImpar.estaVazia()) {
                    System.out.println("Pilha dos números impares vazia");
                } else {
                    pilhaImpar.desempilhar();
                }
            }else if(numero % 2 == 0){
                pilhaPar.empilhar(numero);
            }else{
                    pilhaImpar.empilhar(numero);
            }
        }
        System.out.println("Pilha Par");
        while (!pilhaPar.estaVazia()){
            System.out.println(pilhaPar.desempilhar());
        }

        System.out.println("Pilha Impar");
        while (!pilhaImpar.estaVazia()){
            System.out.println(pilhaImpar.desempilhar());
        } */

        //Exercicio 10
/*         Scanner entrada = new Scanner(System.in);
        Pilha<Livro> pilha = new Pilha<>(20);
        for (int i = 0; i < 2; i++) {
            System.out.println("Nome: ");
            String nome = entrada.nextLine();
            System.out.println("isbn: ");
            String isbn = entrada.nextLine();
            System.out.println("ano lancamento: ");
            int ano = entrada.nextInt();
            entrada.nextLine();
            System.out.println("nome autor: ");
            String autor = entrada.nextLine();
            Livro l = new Livro(nome, isbn, ano, autor);
            pilha.empilhar(l);
        }
        System.out.println(pilha.estaVazia());
        System.out.println(pilha.tamanho());
        System.out.println(pilha.topo());
        System.out.println(pilha.empilhar(new Livro("dadada", "dasds", 2022, "andre")));
        System.out.println(pilha.desempilhar());
        System.out.println(pilha); */

        //Exericcio 11
        Scanner entrada = new Scanner(System.in);
        Stack<Livro> pilha = new Stack<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Nome: ");
            String nome = entrada.nextLine();
            System.out.println("isbn: ");
            String isbn = entrada.nextLine();
            System.out.println("ano lancamento: ");
            int ano = entrada.nextInt();
            entrada.nextLine();
            System.out.println("nome autor: ");
            String autor = entrada.nextLine();
            Livro l = new Livro(nome, isbn, ano, autor);
            pilha.push(l);
        }
        System.out.println(pilha.isEmpty());
        System.out.println(pilha.size());
        System.out.println(pilha.peek());
        System.out.println(pilha.push(new Livro("dadada", "dasds", 2022, "andre")));
        System.out.println(pilha.pop());
        System.out.println(pilha);

    
    }
}

