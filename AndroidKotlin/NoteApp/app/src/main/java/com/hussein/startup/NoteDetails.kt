package com.hussein.startup


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_note_details.*
import kotlinx.android.synthetic.main.fragment_note_details.view.*
import kotlinx.android.synthetic.main.fragment_note_details.view.butUpdate


class NoteDetails : Fragment() {

    //TODO:  5- Define DB instance
    var id:Int?=0
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
       val rootView= inflater.inflate(R.layout.fragment_note_details, container, false)


        //TODO:  6- init DB instance

        try{

            id = arguments!!.getInt("ID",0)
            if(id!=0) {
                rootView.etTitle.setText(arguments!!.getString("name") )
                rootView.etDes.setText(arguments!!.getString("des") )
            }
        }catch (ex:Exception){}

        rootView.butUpdate.setOnClickListener {updateRecord()}

        return rootView
    }



    fun  updateRecord(){



        if(id==0) {

            //TODO:7- insert record


        }else{

            //TODO: 8- Update record

        }
        view!!.findNavController().navigate(R.id.goToHome)

    }
}
