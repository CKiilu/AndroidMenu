package com.scurrae.chris.androidmenu;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by chris on 2/29/16.
 */
public class MyDialogFragment extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());

        theDialog.setTitle("People, please don't overcrowd vehicles.");

        theDialog.setMessage("We don't need to see these sorts of things happening any more.");

        theDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Thank you.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        theDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "How can you be so heartless?",
                        Toast.LENGTH_SHORT).show();
            }
        });
        return super.onCreateDialog(savedInstanceState);
    }
}
