package Models;

import java.util.List;

public class Pergunta {
    public int id;
    public String pergunta;
    public List<Alternativa> alternativas;
    public int faseId;

    public Alternativa ObterAlternativaPorLetra(String letra) {
        int index = -1;


        for(int i = 0; i < alternativas.size(); i++) {
            if(alternativas.get(i).letra.equals(letra)) {
                index = i;
            }
        }

        if(index == -1) {
            return null;
        } else {
            return alternativas.get(index);
        }
    }

    public boolean RespostaCorreta(String letra) {
        Alternativa alt = ObterAlternativaPorLetra(letra);

        if(alt == null) {
            return false;
        }

        return ObterAlternativaPorLetra(letra).correta;
    }
}
