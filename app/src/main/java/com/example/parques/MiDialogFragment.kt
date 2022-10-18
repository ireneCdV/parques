package com.example.parques

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class MiDialogFragment: DialogFragment()  {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity.let {
            val title = "Confirmacion"
            val content = "¿Estas seguro de guardar los datos?"
            val builder: AlertDialog.Builder=AlertDialog.Builder(requireActivity())
            builder.setTitle(title).setMessage(content)
                .setPositiveButton(android.R.string.ok)  {dialog, which ->

                    Toast.makeText(requireActivity().applicationContext,
                        "Se han guardado los datos", Toast.LENGTH_SHORT).show()

                }
                .setNegativeButton(android.R.string.cancel) {dialog, which ->

                    Toast.makeText(requireActivity().applicationContext,
                        "Se a cancelado la accion", Toast.LENGTH_SHORT).show()
                }
            //Devuelve un AlertDialog
            //tal y como lo hemos definido en el builder


            return builder.create()} ?: throw IllegalStateException("El fragmento no está asociado a ninguna actividad")
    }
}