package aplicativos;

import funcoes.NavegadorApp;

public class Safari implements NavegadorApp{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página X.com");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba à direita");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

}