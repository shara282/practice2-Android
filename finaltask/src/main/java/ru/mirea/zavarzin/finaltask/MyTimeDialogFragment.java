package ru.mirea.zavarzin.finaltask;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;


public class MyTimeDialogFragment extends TimePickerDialog {

    public MyTimeDialogFragment(Context context, OnTimeSetListener listener, int hourOfDay, int minute, boolean is24HourView) {
        super(context, listener, hourOfDay, minute, is24HourView);
    }
 /*   public Dialog onCreateDialog(Bundle savedInstanceState) {
        TimePickerDialog.Builder builder = new TimePickerDialog.Builder(getOwnerActivity());
        return builder.create();
    } */

}
