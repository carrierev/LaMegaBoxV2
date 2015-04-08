package data.com.lamegaboxv2.boxes;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class MisterMvFragment extends Fragment {

    private MediaPlayer mistermvOne;
    private MediaPlayer mistermvTwo;
    private MediaPlayer mistermvThree;

	public MisterMvFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

        //TODO: Soundpool pour fichier court ?
        //        final SoundPool sounds;
        //        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        //        {
        //            sounds = createNewSoundPool();
        //        }
        //        else
        //        {
        //            sounds = createOldSoundPool();
        //        }
        //
        //        final int mistermvOne = sounds.load(getActivity().getApplicationContext(), R.raw.mistermv, 1);

		View view = inflater.inflate(R.layout.fragment_mistermv, container,
				false);
        
        ImageButton firstMistermv = (ImageButton) view.findViewById(R.id.mistermvOne);
        firstMistermv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // sounds.play(mistermvOne, 1, 1, 1, 0, 1);
                mistermvOne.start();
            }
        });
/*

        ImageButton secondMistermv = (ImageButton) view.findViewById(R.id.mistermvTwo);
        secondMistermv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // mistermvTwo.start();
            }
        });

        ImageButton thirdMistermv = (ImageButton) view.findViewById(R.id.mistermvThree);
        thirdMistermv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // mistermvThree.start();
            }
        });
*/

		return view;
	}

    @Override
    public void onPause() {
        releaseMedia();
        super.onPause();
    }

    @Override
    public void onResume() {
        loadMedia();
        super.onResume();
    }

    public void loadMedia()
    {
        mistermvOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.mistermv);
       // mistermvTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.mistermv2);
       // mistermvThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.mistermv3);
    }

    public void releaseMedia()
    {
        mistermvOne.release();
      //  mistermvTwo.release();
      //  mistermvThree.release();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected SoundPool createNewSoundPool(){

        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        return new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();

    }

    @SuppressWarnings("deprecation")
    protected SoundPool createOldSoundPool(){
        return new SoundPool(5,AudioManager.STREAM_MUSIC,0);
    }

}