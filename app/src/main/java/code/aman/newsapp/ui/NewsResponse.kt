package code.aman.newsapp.ui


data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults:Int
)