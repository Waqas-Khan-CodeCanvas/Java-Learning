import javax.speech.*;
import java.util.*;
import javax.speech.synthesis.*;
public class TextToSpeechExample2
{
    //text to listen
    String speaktext;
    //function that makes text audible
    public void dospeak(String speak, String voicename)
    {
//assigning text to speak variable  
        speaktext=speak;
        String voiceName =voicename;
        try
        {
            SynthesizerModeDesc desc = new SynthesizerModeDesc(null, "general",  Locale.US, null, null);
            Synthesizer synthesizer =  Central.createSynthesizer(desc);
            synthesizer.allocate();
            synthesizer.resume();
            desc = (SynthesizerModeDesc)  synthesizer.getEngineModeDesc();
            Voice[] voices = desc.getVoices();
            Voice voice = null;
            for (int i = 0; i < voices.length; i++)
            {
                if (voices[i].getName().equals(voiceName))
                {
                    voice = voices[i];
                    break;
                }
            }
            synthesizer.getSynthesizerProperties().setVoice(voice);
            System.out.print("Speaking: "+speaktext);
            synthesizer.speakPlainText(speaktext, null);
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            synthesizer.deallocate();
        }
        catch (Exception e)
        {
            String message = " missing speech.properties in " + System.getProperty("user.home") + "\n";
            System.out.println(""+e);
            System.out.println(message);
        }
    }
    public static void main(String args[])
    {
        TextToSpeechExample2 obj=new TextToSpeechExample2();
        obj.dospeak("Don't limit yourself. Many people limit themselves to what they think they can do. You can go as far as your mind lets you. What you believe, remember, you can achieve.", "kevin16");
    }
}  