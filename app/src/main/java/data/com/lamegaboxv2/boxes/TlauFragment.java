package data.com.lamegaboxv2.boxes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import data.com.lamegaboxv2.R;

public class TlauFragment extends Fragment {

    private MediaPlayer tlauOne;
    private MediaPlayer tlauTwo;
    private MediaPlayer tlauThree;
    private MediaPlayer tlauFour;
    private MediaPlayer tlauFive;
    private MediaPlayer tlauSix;

	public TlauFragment() {

	}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadMedia();
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_tlow, container,
				false);
        ImageButton firstTlau = (ImageButton) view.findViewById(R.id.tlowOne);
        firstTlau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tlauOne.start();
            }
        });
        ImageButton secondTlau = (ImageButton) view.findViewById(R.id.tlowTwo);
        secondTlau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tlauTwo.start();
            }
        });

        ImageButton thirdTlau = (ImageButton) view.findViewById(R.id.tlowThree);
        thirdTlau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tlauThree.start();
            }
        });

        ImageButton fourthTlau = (ImageButton) view.findViewById(R.id.tlowFour);
        fourthTlau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tlauFour.start();
            }
        });

        ImageButton fifthTlau = (ImageButton) view.findViewById(R.id.tlowFive);
        fifthTlau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tlauFive.start();
            }
        });

        ImageButton SixthTlau = (ImageButton) view.findViewById(R.id.tlowSix);
        SixthTlau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tlauSix.start();
            }
        });
		return view;
	}

    @Override
    public void onResume() {
        loadMedia();
        super.onResume();
    }

    @Override
    public void onPause() {
        releaseMedia();
        super.onPause();
    }

    public void loadMedia()
    {
        tlauOne = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.tlow);
        tlauTwo = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.tlow2);
        tlauThree = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.tlow3);
        tlauFour = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.tlow4);
        tlauFive = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.tlow5);
        tlauSix = MediaPlayer.create(getActivity().getApplicationContext(), R.raw.tlow6);
    }


    public void releaseMedia()
    {
        tlauOne.release();
        tlauTwo.release();
        tlauThree.release();
        tlauFour.release();
        tlauFive.release();
        tlauSix.release();
    }


}