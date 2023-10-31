//package br.senai.sp.jandira.model;
//
//import br.senai.sp.jandira.model.Voo;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GerenciadorVoos {
//    private List<Voo> listaDeVoos = new ArrayList<>();
//
//    public void adicionarVoo(Voo voo) {
//        listaDeVoos.add(voo);
//    }
//
//    public List<Voo> getListaDeVoos() {
//        return listaDeVoos;
//    }
//
//    public List<Voo> buscarVoosPorNumero(int numero) {
//        List<Voo> voosEncontrados = new ArrayList<>();
//        for (Voo voo : listaDeVoos) {
//            if (voo.getNumeroVoo() == numero) {
//                voosEncontrados.add(voo);
//            }
//        }
//        return voosEncontrados;
//    }
//}
