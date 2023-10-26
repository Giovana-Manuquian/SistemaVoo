package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class VooAzul extends Voo {
    List<Voo> listAzul = new ArrayList<>();

    public void adicionarAzul(VooAzul vooAzul){
        listAzul.add(vooAzul);
    }
}
