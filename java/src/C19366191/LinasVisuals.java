package C19366191;

import ie.tudublin.Visual;
import ddf.minim.*;
import ddf.minim.analysis.*;

public class LinasVisuals extends Visual{

    Waveform wf;
   

    public void settings()
    {
        size(1024, 500);
 
    }

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("Punjabi.mp3");   

        //test waveform
        wf = new Waveform(this);

    }

    

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
            
        }
    }

    public void draw()
    {
        background(0);

        wf.render();
    }
    
    
}