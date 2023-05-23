package com.example.convidados.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.convidados.constants.DataBaseConstants

// GuestDataBase: conexão com o Banco de dados

class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {

        companion object {
            private const val NAME = "guestdb"
            private const val VERSION = 1
        }

    override fun onCreate(db: SQLiteDatabase) {
        // Criação do banco (só é chamado 1 unica vez quando é criado)
        db.execSQL("CREATE TABLE " + DataBaseConstants.GUEST.TABLE_NAME +" (" +
                DataBaseConstants.GUEST.COLUMNS.ID + " integer PRIMARY KEY AUTOINCREMENT, " +
                DataBaseConstants.GUEST.COLUMNS.NAME + " text, " +
                DataBaseConstants.GUEST.COLUMNS.PRESENCE + " integer);")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) { // p1: oldVersion, p2: newVersion
        // Atualização do banco (só é chamado caso haja uma nersão nova do banco)
    }
}