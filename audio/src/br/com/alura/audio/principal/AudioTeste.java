package br.com.alura.audio.principal;

import br.com.alura.audio.partes.Audio;
import br.com.alura.audio.partes.MinhasPreferidas;
import br.com.alura.audio.partes.Musica;
import br.com.alura.audio.partes.Podcast;

public class AudioTeste {
    public static void main(String[] args) {
    Musica musica = new Musica();
    musica.setTitulo("Rush Rush");
    musica.setArtista("Avril Lavigne");

        for (int i = 0; i < 2001; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

    Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 2000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
            preferidas.inclui(podcast);
            preferidas.inclui(musica);
    }
}
