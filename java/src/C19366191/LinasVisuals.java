package C19366191;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
// import ddf.minim.*;
// import ddf.minim.analysis.*;

public class LinasVisuals extends Visual
{
    //Wave wave;
    Sphere s;
    Pryamid pyramid;
    Cube cube;

    public void settings()
    {
        size(1024, 600, P3D);
    }
    
    public void setup()
    {
        startMinim();
        loadAudio("Punjabi.mp3");
        //loadAudio("Dharma.mp3");

        //wave = new Wave(this);
        s = new Sphere(this);
        pyramid = new Pryamid(this);
        cube = new Cube(this);

    }


    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }
        if (key == '1')
        {
            s.render();
        
        }
        if (key == '2')
        {
            pyramid.render();
            
        }
        if (key == '3')
        {
            cube.render();
        }
        
    }

    

    public void draw()
    {
        background(0);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude(); 
    
        if (key == '1')
        {
            s.render();
      
        }
        if (key == '2')
        {
            
            pyramid.render();
                
        }
        if (key == '3')
        {
            cube.render();
        }
        
  

    }
}