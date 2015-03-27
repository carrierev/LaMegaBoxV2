package data.com.lamegaboxv2.boxes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class PoubelleFragment extends Fragment {

    private MediaPlayer poubelleOne;
    private MediaPlayer poubelleTwo;
    private MediaPlayer poubelleThree;
    private MediaPlayer poubelleFour;
    private MediaPlayer poubelleFive;

	public PoubelleFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_poubelle, container,
				false);
        ImageButton firstPoubelle = (ImageButton) view.findViewById(R.id.poubelleOne);
        firstPoubelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poubelleOne.start();
            }
        });
        ImageButton secondPoubelle = (ImageButton) view.findViewById(R.id.poubelleTwo);
        secondPoubelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poubelleTwo.start();
            }
        });
        ImageButton thirdPoubelle = (ImageButton) view.findViewById(R.id.poubelleThree);
        thirdPoubelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poubelleThree.start();
            }
        });
        ImageButton fourthPoubelle = (ImageButton) view.findViewById(R.id.poubelleFour);
        fourthPoubelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poubelleFour.start();
            }
        });
        ImageButton fifthPoubelle = (ImageButton) view.findViewById(R.id.poubelleFive);
        fifthPoubelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poubelleFive.start();
            }
        });
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
        poubelleOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.pizza);
        poubelleTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.farandole);
        poubelleThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.bien_bien);
        poubelleFour = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.chalet);
        poubelleFive = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.pas_coupable);
    }

    public void releaseMedia()
    {
        poubelleOne.release();
        poubelleTwo.release();
        poubelleThree.release();
        poubelleFour.release();
        poubelleFive.release();
    }


}