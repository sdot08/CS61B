/**
 * Created by hp on 2017/8/14.
 */
public class GuitarHero {


    public static void main(String[] args) {
        String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
        synthesizer.GuitarString[] strings = new synthesizer.GuitarString[37];
        for(int i=0; i<37; i++)
            strings[i]=new synthesizer.GuitarString(440*Math.pow(2, (i-24)/12));
        while (true) {

            /* check if the user has typed a key; if so, process it */
            if (StdDraw.hasNextKeyTyped()) {
                char key = StdDraw.nextKeyTyped();
                for (int i = 0; i < 37; i++) {
                    if (key == keyboard.charAt(i)){
                        strings[i].pluck();
                    }
                }
            }
            double sample=0;
        /* compute the superposition of samples */
            for (int i = 0; i < 37; i++) {
                sample += strings[i].sample();
            }


        /* play the sample on standard audio */
            StdAudio.play(sample);

        /* advance the simulation of each guitar string by one step */
            for (int i = 0; i < 37; i++) {
                strings[i].tic();
            }
        }
    }
}
