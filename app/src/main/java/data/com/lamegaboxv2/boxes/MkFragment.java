package data.com.lamegaboxv2.boxes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class MkFragment extends Fragment {

    private MediaPlayer mkOne;
    private MediaPlayer mkTwo;
    private MediaPlayer mkThree;


	public MkFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_mk, container,
				false);
        ImageButton firstMk = (ImageButton) view.findViewById(R.id.mkOne);
        firstMk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mkOne.start();
            }
        });
        ImageButton secondMk = (ImageButton) view.findViewById(R.id.mkTwo);
        secondMk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mkTwo.start();
            }
        });
        ImageButton thirdMk = (ImageButton) view.findViewById(R.id.mkThree);
        thirdMk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mkThree.start();
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
        mkOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.mk);
        mkTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.mk2);
        mkThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.mk3);
    }

    public void releaseMedia()
    {
        mkOne.release();
        mkTwo.release();
        mkThree.release();
    }

}