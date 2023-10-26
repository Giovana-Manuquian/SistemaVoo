package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class VooEmirates extends Voo {
    List<Voo> listEmieates = new ArrayList<>();

    public VooEmirates()

    public void adicionarEmirates(VooEmirates vooEmirates){
        listEmieates.add(vooEmirates);
    }

}
