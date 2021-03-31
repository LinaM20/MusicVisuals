package C19366191;

import ie.tudublin.*;

public class LinasVisuals extends Visual{

    Waveform wf;
 
    public void settings()
    {
        size(800, 700);
        
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(P3D, SPAN); 
    }

    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("Punjabi.mp3");   

        
        // Call this instead to read audio from the microphone
        //startListening(); 
        
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

    
