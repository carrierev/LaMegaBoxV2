package data.com.lamegaboxv2.boxes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class ZelkysFragment extends Fragment {

    private MediaPlayer zelkysOne;
    private MediaPlayer zelkysTwo;
    private MediaPlayer zelkysThree;
    private MediaPlayer zelkysFour;
    private MediaPlayer zelkysFive;

	public ZelkysFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_zelkys, container,
				false);
        ImageButton firstPoubelle = (ImageButton) view.findViewById(R.id.zelkysOne);
        firstPoubelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zelkysOne.start();
            }
        });
        ImageButton secondPoubelle = (ImageButton) view.findViewById(R.id.zelkysTwo);
        secondPoubelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zelkysTwo.start();
            }
        });
        ImageButton thirdPoubelle = (ImageButton) view.findViewById(R.id.zelkysThree);
        thirdPoubelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zelkysThree.start();
            }
        });
        ImageButton fourthPoubelle = (ImageButton) view.findViewById(R.id.zelkysFour);
        fourthPoubelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zelkysFour.start();
            }
        });
        ImageButton fifthPoubelle = (ImageButton) view.findViewById(R.id.zelkysFive);
        fifthPoubelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zelkysFive.start();
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
        zelkysOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.zelkys);
        zelkysTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.zelkys2);
        zelkysThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.zelkys3);
        zelkysFour = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.zelkys4);
        zelkysFive = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.zelkys5);
    }

    public void releaseMedia()
    {
        zelkysOne.release();
        zelkysTwo.release();
        zelkysThree.release();
        zelkysFour.release();
        zelkysFive.release();
    }

}