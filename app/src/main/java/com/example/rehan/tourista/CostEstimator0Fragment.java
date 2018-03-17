package com.example.rehan.tourista;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CostEstimator0Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CostEstimator0Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CostEstimator0Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public CostEstimator0Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CostEstimator0Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CostEstimator0Fragment newInstance(String param1, String param2) {
        CostEstimator0Fragment fragment = new CostEstimator0Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_cost_estimator0, container, false);

        // NOTE : We are calling the onFragmentInteraction() declared in the MainActivity
        // ie we are sending "Fragment 1" as title parameter when fragment1 is activated
        if (mListener != null) {
            mListener.onFragmentInteraction(Uri.parse("Estimate Cost"));
        }
        Button btn = (Button) view.findViewById(R.id.estimate_btn_cost_estimator0_xml);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//
//                Fragment newFragment = new CostEtimatorFragment();
//                FragmentTransaction transaction = getFragmentManager().beginTransaction();
//// Replace whatever is in the fragment_container view with this fragment,
//// and add the transaction to the back stack
//                transaction.replace(R.id.mainFrame, newFragment);
//                transaction.addToBackStack(null);
//// Commit the transaction
//                abc();
//                transaction.commit();
            }
        });
        return view;
       // return inflater.inflate(R.layout.fragment_cost_estimator0, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    private void abc(){
        getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
        getFragmentManager().popBackStack();
    }
}
