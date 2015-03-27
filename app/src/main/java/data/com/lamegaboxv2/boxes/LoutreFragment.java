package data.com.lamegaboxv2.boxes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class LoutreFragment extends Fragment {

    private MediaPlayer loutreOne;
    private MediaPlayer loutreTwo;
    private MediaPlayer loutreThree;

	public LoutreFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_loutre, container,
				false);
        ImageButton firstTlow = (ImageButton) view.findViewById(R.id.loutreOne);
        firstTlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loutreOne.start();
            }
        });
        ImageButton secondTlow = (ImageButton) view.findViewById(R.id.loutreTwo);
        secondTlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loutreTwo.start();
            }
        });

        ImageButton thirdTlow = (ImageButton) view.findViewById(R.id.loutreThree);
        thirdTlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loutreThree.start();
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
        loutreOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.loutre);
        loutreTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.loutre2);
        loutreThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.loutre3);
    }

    public void releaseMedia()
    {
        loutreOne.release();
        loutreTwo.release();
        loutreThree.release();
    }

}