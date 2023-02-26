package edu.monmouth.s1327632.cs250.njgaspumps

class GasStation {
    //Properties
    val SITE_NAME: String
    val PRICE: Double
    val ADDRESS_LINE_1: String
    val STATE_OR_COUNTRY_CODE: String
    val CITY: String
    val OBJECTID: Int
    val ZIP_CODE: Int
    val SITE_ID: Int
    val COUNTY: String


    object{
            val gasStationList= ArrayList<GasStation>()
            try {
              val jsonString = loadJsonFromAsset (filename, context)
                if (jsonString != null){
                    val json = JSONObject(jsonString)

                    val jsonArray= json.getJSONarray("gasStations")


                    (0 until jsonArray.length()).mapTo(gasStationList) {
                        GasStation (jsonArray.getJSONObject(it),getInt("siteID"))
                        jsonArray.getJSONObject(it).getString("siteName"),
                        jsonArray.getJSONObject(it).getString("address"),
                        jsonArray.getJSONObject(it).getString("addressCity"),
                        jsonArray.getJSONObject(it).getString("addressZip))
                    }
                }else {
                    println("not a valid JSON string")
                }

            }catch (ex: java.io.IOException)
        { ex.printStackTrace()
            return null
        }
            return jsonString
    }

    override fun toString(): String {
        return "GasStation(siteName='$siteName', " +
                            "price='$price', " +
                            "address='$address'," +
                            "addressCity='$addressCity',"+
                            "addressZip='$addressZip',"+
                            "siteID='$siteID')"
    }
}




