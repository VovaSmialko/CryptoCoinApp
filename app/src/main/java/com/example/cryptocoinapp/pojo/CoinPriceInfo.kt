package com.example.cryptocoinapp.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cryptocoinapp.api.ApiFactory.BASE_IMAGE_URL
import com.example.cryptocoinapp.utils.convertTimestampToTime
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

@Entity("full_price_list")
data class CoinPriceInfo(
    @SerializedName("TYPE")
    @Expose
    val type: String? = null,

    @SerializedName("MARKET")
    @Expose
    val market: String? = null,

    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    val fromSymbol: String,

    @SerializedName("TOSYMBOL")
    @Expose
    val toSymbol: String? = null,

    @SerializedName("FLAGS")
    @Expose
    val flags: String? = null,

    @SerializedName("PRICE")
    @Expose
    val price: String? = null,

    @SerializedName("LASTUPDATE")
    @Expose
    val lastUpdate: Long? = null,

    @SerializedName("MEDIAN")
    @Expose
    val median: Double? = null,

    @SerializedName("LASTVOLUME")
    @Expose
    val lastVolume: Double? = null,

    @SerializedName("LASTVOLUMETO")
    @Expose
    val lastVolumeto: Double? = null,

    @SerializedName("LASTTRADEID")
    @Expose
    val lastTradeId: String? = null,

    @SerializedName("VOLUMEDAY")
    @Expose
    val volumeDay: Double? = null,

    @SerializedName("VOLUMEDAYTO")
    @Expose
    val volumeDayTo: Double? = null,

    @SerializedName("VOLUME24HOUR")
    @Expose
    val volume24hour: Double? = null,

    @SerializedName("VOLUME24HOURTO")
    @Expose
    val volume24hourTo: Double? = null,

    @SerializedName("OPENDAY")
    @Expose
    val openDay: Double? = null,

    @SerializedName("HIGHDAY")
    @Expose
    val highDay: Double? = null,

    @SerializedName("LOWDAY")
    @Expose
    val lowDay: Double? = null,

    @SerializedName("HIGH24HOUR")
    @Expose
    val high24hour: Double? = null,

    @SerializedName("LOW24HOUR")
    @Expose
    val low24hour: Double? = null,

    @SerializedName("LASTMARKET")
    @Expose
    val lastmarket: String? = null,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val toptiervolume24hour: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val toptiervolume24hourto: Double? = null,

    @SerializedName("CHANGE24HOUR")
    @Expose
    val change24hour: Double? = null,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val changepct24hour: Double? = null,

    @SerializedName("CHANGEDAY")
    @Expose
    val changeday: Double? = null,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    val changepctday: Double? = null,

    @SerializedName("CHANGEHOUR")
    @Expose
    val changehour: Double? = null,

    @SerializedName("CHANGEPCTHOUR")
    @Expose
    val changepcthour: Double? = null,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    val conversiontype: String? = null,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    val conversionsymbol: String? = null,

    @SerializedName("CONVERSIONLASTUPDATE")
    @Expose
    val conversionlastupdate: Int? = null,

    @SerializedName("SUPPLY")
    @Expose
    val supply: Int? = null,

    @SerializedName("MKTCAP")
    @Expose
    val mktcap: Double? = null,

    @SerializedName("MKTCAPPENALTY")
    @Expose
    val mktcappenalty: Int? = null,

    @SerializedName("CIRCULATINGSUPPLY")
    @Expose
    val circulatingsupply: Int? = null,

    @SerializedName("CIRCULATINGSUPPLYMKTCAP")
    @Expose
    val circulatingsupplymktcap: Double? = null,

    @SerializedName("TOTALVOLUME24H")
    @Expose
    val totalvolume24h: Double? = null,

    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    val totalvolume24hto: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    val totaltoptiervolume24h: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    val totaltoptiervolume24hto: Double? = null,

    @SerializedName("IMAGEURL")
    @Expose
    val imageurl: String? = null
) {
    fun getFormattedTime(): String {
        return convertTimestampToTime(lastUpdate)
    }

    fun getFullImageUrl(): String {
        return BASE_IMAGE_URL + imageurl
    }
}