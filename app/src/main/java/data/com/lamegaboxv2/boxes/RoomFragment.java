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

public class RoomFragment extends Fragment {

    private MediaPlayer roomOne;
    private MediaPlayer roomTwo;
    private MediaPlayer roomThree;
    private MediaPlayer roomFour;
    private MediaPlayer roomFive;
    private MediaPlayer roomSix;
    private MediaPlayer roomSeven;
    private MediaPlayer roomEight;
    private MediaPlayer roomNine;
    private MediaPlayer roomEleven;

	public RoomFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       loadMedia();
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

        final int room1 = sounds.load(getActivity().getApplicationContext(), R.raw.room, 1);
        final int room2 = sounds.load(getActivity().getApplicationContext(), R.raw.room2, 1);
        final int room3 = sounds.load(getActivity().getApplicationContext(), R.raw.room3, 1);
        final int room4 = sounds.load(getActivity().getApplicationContext(), R.raw.room4, 1);
        final int room5 = sounds.load(getActivity().getApplicationContext(), R.raw.room5, 1);
        final int room6 = sounds.load(getActivity().getApplicationContext(), R.raw.room6, 1);
        final int room7 = sounds.load(getActivity().getApplicationContext(), R.raw.room7, 1);
        final int room8 = sounds.load(getActivity().getApplicationContext(), R.raw.room8, 1);
        final int room9 = sounds.load(getActivity().getApplicationContext(), R.raw.room9, 1);
        final int room10 = sounds.load(getActivity().getApplicationContext(), R.raw.room10, 1);
        final int room12 = sounds.load(getActivity().getApplicationContext(), R.raw.room12, 1);



        View view = inflater.inflate(R.layout.fragment_room, container,
				false);
        ImageButton firstRoom = (ImageButton) view.findViewById(R.id.roomOne);
        firstRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // roomOne.start();
               sounds.play(room1, 1, 1, 1, 0, 1);
            }
        });
        ImageButton secondRoom = (ImageButton) view.findViewById(R.id.roomTwo);
        secondRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room2, 1, 1, 1, 0, 1);
                //roomTwo.start();
            }
        });

        ImageButton thirdRoom = (ImageButton) view.findViewById(R.id.roomThree);
        thirdRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room3, 1, 1, 1, 0, 1);
                //roomThree.start();
            }
        });

        ImageButton fourthRoom = (ImageButton) view.findViewById(R.id.roomFour);
        fourthRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room4, 1, 1, 1, 0, 1);
               // roomFour.start();
            }
        });

        ImageButton fifthRoom = (ImageButton) view.findViewById(R.id.roomFive);
        fifthRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room5, 1, 1, 1, 0, 1);
                //roomFive.start();
            }
        });
        
        ImageButton SixthRoom = (ImageButton) view.findViewById(R.id.roomSix);
        SixthRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room6, 1, 1, 1, 0, 1);
                //roomSix.start();
            }
        });

        ImageButton SeventhRoom = (ImageButton) view.findViewById(R.id.roomSeven);
        SeventhRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room7, 1, 1, 1, 0, 1);
               // roomSeven.start();
            }
        });

        ImageButton EighthRoom = (ImageButton) view.findViewById(R.id.roomEight);
        EighthRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room8, 1, 1, 1, 0, 1);
               // roomEight.start();
            }
        });

        ImageButton NineRoom = (ImageButton) view.findViewById(R.id.roomNine);
        NineRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room9, 1, 1, 1, 0, 1);
                //roomNine.start();
            }
        });

        ImageButton TenRoom = (ImageButton) view.findViewById(R.id.roomTen);
        TenRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room10, 1, 1, 1, 0, 1);
                //roomNine.start();
            }
        });

        ImageButton ElevenRoom = (ImageButton) view.findViewById(R.id.roomEleven);
        ElevenRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // sounds.play(room11, 1, 1, 1, 0, 1);
                roomEleven.start();
            }
        });

        ImageButton TwelveRoom = (ImageButton) view.findViewById(R.id.roomTwelve);
        TwelveRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.play(room12, 1, 1, 1, 0, 1);
                //roomNine.start();
            }
        });
		return view;
	}

    @Override
    public void onPause()
    {
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
        roomEleven = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room11);
//        roomOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room);
//        roomTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room2);
//        roomThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room3);
//        roomFour = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room4);
//        roomFive = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room5);
//        roomSix = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room6);
//        roomSeven = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room7);
//        roomEight = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room8);
//        roomNine = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.room9);
    }

    public void releaseMedia()
    {
        roomEleven.release();
//        roomOne.release();
//        roomTwo.release();
//        roomThree.release();
//        roomFour.release();
//        roomFive.release();
//        roomSix.release();
//        roomSeven.release();
//        roomEight.release();
//        roomNine.release();
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
        return new SoundPool(30, AudioManager.STREAM_MUSIC,0);
    }
}