package project.api.id20192713.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("getDrbEasyDrugList")
    suspend fun getDrugList(
        @Query("serviceKey") serviceKey: String = "BGtEWN1IlvSGC1CZ+AwVeqDJdURuUgqhYHbjcRclDEwiqmQurBgqccTKfFaiFQKvBnYEM64oe6tvsfov+NK1/A==",
        @Query("pageNo") pageNo: Int = 1,
        @Query("numOfRows") numOfRows: Int = 10,
        @Query("entpName") entpName: String? = null,
        @Query("itemName") itemName: String? = null,
        @Query("efcyQesitm") efcyQesitm: String? = null,
        @Query("type") type: String = "json",
    ) : ApiResponse
}