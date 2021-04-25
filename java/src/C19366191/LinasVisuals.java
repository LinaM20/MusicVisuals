package C19366191;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
// import ddf.minim.*;
// import ddf.minim.analysis.*;

public class LinasVisuals extends Visual
{
    Wave wave;
    Sphere sphere;
    Cube cube;
    Circle circle;
    Pyramid pyramid;

    public void settings()
    {
        size(1024, 600, P3D);
        
    }
    
    public void setup()
    {
        startMinim();
        //loadAudio("Punjabi.mp3");
        //loadAudio("Dharma.mp3");
        loadAudio("FeelSoClose.mp3");
     
        wave = new Wave(this);
        sphere = new Sphere(this);
        cube = new Cube(this);
        circle = new Circle(this);
        pyramid = new Pyramid(this);

    }


    public void keyPressed()
    {
        if (key == ' ')
        {
            if (getAudioPlayer().isPlaying()) 
            {
                getAudioPlayer().pause();
            } else
            {
                getAudioPlayer().play();
            }           
            
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
      
        switch (key) {
            case '1':
                sphere.render();
                break;

            case '2':
                circle.render();
                break;

            case '3':
                cube.render();
                wave.render();
                break;
            case '4':
                pyramid.render();
                break;
        }

        
  

    }
}