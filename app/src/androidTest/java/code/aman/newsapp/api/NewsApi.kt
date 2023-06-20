
package code.aman.newsapp.api

import retrofit2.http.GET
import retrofit2.http.Query
import java.nio.channels.spi.AbstractSelectionKey

interface NewsApi {

    @GET("NewsAPI/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String ="us",
        @Query("page")
        pageNumber: Int= 1,
        @Query("apiKey")
        apiKey: String = API_KEY

    )
}