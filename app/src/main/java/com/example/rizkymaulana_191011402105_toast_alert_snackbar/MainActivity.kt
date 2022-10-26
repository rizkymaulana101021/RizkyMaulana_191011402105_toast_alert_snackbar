package com.example.rizkymaulana_191011402105_toast_alert_snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_toast.setOnClickListener{
            Toast.makeText(this, "Ini Adalah Toast", Toast.LENGTH_SHORT).show()
        }

        btn_snackbar.setOnClickListener{ view ->
            Snackbar.make(view, "Ini Adalah Snackbar", Snackbar.LENGTH_SHORT).show()
        }

        btn_alert.setOnClickListener{
            val dialog = AlertDialog.Builder(this)
            dialog.apply {
                setTitle("Konfirmasi Hapus")
                setMessage("Apakah anda yakin untuk menghapus?")
                setNegativeButton("Batal") {dialogInterface, i ->
                    dialogInterface.dismiss()
                }
                setPositiveButton("Ya") {dialogInterface, c ->
                    Toast.makeText(this@MainActivity, "Berhasil Menghapus", Toast.LENGTH_SHORT).show()
                }
                dialog.show()
            }
        }
    }
}