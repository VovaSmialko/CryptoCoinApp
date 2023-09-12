package com.example.cryptocoinapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cryptocoinapp.pojo.CoinPriceInfo

@Dao
interface CoinPriceInfoDao {
    @Query("SELECT * FROM full_price_list ORDER BY lastUpdate")
    fun getPriceList(): LiveData<List<CoinPriceInfo>>
    // Метод щоб виводити список валют в RecyclerView

    @Query("SELECT * FROM full_price_list WHERE fromSymbol == :fSym LIMIT 1")
    fun getPriceInfoAboutCoin(fSym: String): LiveData<List<CoinPriceInfo>>
    // Буде повертати інформацію про 1 валюту, щоб ми могли вивести всю детальну інфу на окремому екрані

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPriceList(priceList: List<CoinPriceInfo>)
    // Буде зберігати з інтернету отримані дані в базу
}