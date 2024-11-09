package com.thykkannotech.minhasMusicas.principal;

import com.thykkannotech.minhasMusicas.modelos.Musica;
import com.thykkannotech.minhasMusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("forever");
        minhaMusica.setCantor("Kiss"); 

        for(int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();;
        }
        for(int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

    }
}
