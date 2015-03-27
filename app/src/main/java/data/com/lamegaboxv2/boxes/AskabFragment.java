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

public class AskabFragment extends Fragment {

    private MediaPlayer askabOne;
    private MediaPlayer askabTwo;
    private MediaPlayer askabThree;
    private MediaPlayer askabFour;
    private MediaPlayer askabFive;
    private MediaPlayer askabSix;
    private MediaPlayer askabSeven;
    private MediaPlayer askabEight;
    private MediaPlayer askabNine;

	public AskabFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

        final SoundPool sounds;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            sounds = createNewSoundPool();
        }
        else
        {
            sounds = createOldSoundPool();
        }

        final int askab1 = sounds.load(getActivity().getApplicationContext(), R.raw.askab, 1);
        final int askab2 = sounds.load(getActivity().getApplicationContext(), R.raw.askab2, 1);
        final int askab3 = sounds.load(getActivity().getApplicationContext(), R.raw.askab3, 1);
        final int askab4 = sounds.load(getActivity().getApplicationContext(), R.raw.askab4, 1);
        final int askab5 = sounds.load(getActivity().getApplicationContext(), R.raw.askab5, 1);
        final int askab6 = sounds.load(getActivity().getApplicationContext(), R.raw.askab6, 1);
        final int askab7 = sounds.load(getActivity().getApplicationContext(), R.raw.askab7, 1);
        final int askab8 = sounds.load(getActivity().getApplicationContext(), R.raw.askab8, 1);
        final int askab9 = sounds.load(getActivity().getApplicationContext(), R.raw.askab9, 1);

        View view = inflater.inflate(R.layout.fragment_askab, container,
				false);
        ImageButton firstAskab = (ImageButton) view.findViewById(R.id.askabOne);
        firstAskab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // askabOne.start();
               sounds.play(askab1, 1, 1, 1, 0, 1);
            }
        });
        ImageButton secondAskab = (ImageButton) view.findViewById(R.id.askabTwo);
        secondAskab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(askab2, 1, 1, 1, 0, 1);
                //askabTwo.start();
            }
        });

        ImageButton thirdAskab = (ImageButton) view.findViewById(R.id.askabThree);
        thirdAskab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(askab3, 1, 1, 1, 0, 1);
                //askabThree.start();
            }
        });

        ImageButton fourthAskab = (ImageButton) view.findViewById(R.id.askabFour);
        fourthAskab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(askab4, 1, 1, 1, 0, 1);
               // askabFour.start();
            }
        });

        ImageButton fifthAskab = (ImageButton) view.findViewById(R.id.askabFive);
        fifthAskab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(askab5, 1, 1, 1, 0, 1);
                //askabFive.start();
            }
        });
        
        ImageButton SixthAskab = (ImageButton) view.findViewById(R.id.askabSix);
        SixthAskab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(askab6, 1, 1, 1, 0, 1);
                //askabSix.start();
            }
        });

        ImageButton SeventhAskab = (ImageButton) view.findViewById(R.id.askabSeven);
        SeventhAskab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(askab7, 1, 1, 1, 0, 1);
               // askabSeven.start();
            }
        });

        ImageButton EighthAskab = (ImageButton) view.findViewById(R.id.askabEight);
        EighthAskab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(askab8, 1, 1, 1, 0, 1);
               // askabEight.start();
            }
        });

        ImageButton NineAskab = (ImageButton) view.findViewById(R.id.askabNine);
        NineAskab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(askab9, 1, 1, 1, 0, 1);
                //askabNine.start();
            }
        });
		return view;
	}

    @Override
    public void onPause()
    {
        //releaseMedia();
        super.onPause();
    }

    @Override
    public void onResume() {
        //loadMedia();
        super.onResume();
    }

    public void loadMedia()
    {
        askabOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab);
        askabTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab2);
        askabThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab3);
        askabFour = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab4);
        askabFive = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab5);
        askabSix = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab6);
        askabSeven = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab7);
        askabEight = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab8);
        askabNine = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.askab9);
    }

    public void releaseMedia()
    {
        askabOne.release();
        askabTwo.release();
        askabThree.release();
        askabFour.release();
        askabFive.release();
        askabSix.release();
        askabSeven.release();
        askabEight.release();
        askabNine.release();
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected SoundPool createNewSoundPool(){

        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        return new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();

    }

    @SuppressWarnings("deprecation")
    protected SoundPool createOldSoundPool(){
        return new SoundPool(10, AudioManager.STREAM_MUSIC,0);
    }
}