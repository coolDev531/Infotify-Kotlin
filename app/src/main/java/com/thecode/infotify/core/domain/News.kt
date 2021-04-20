package com.thecode.infotify.core.domain

data class News(
    val status: String,
    val totalResults: String,
    val articles: List<Article>
)

data class Article(
    var source: SourceItem? = null,
    var author: String? = null,
    var title: String? = null,
    var description: String? = null,
    var url: String? = null,
    var urlToImage: String? = null,
    var publishedAt: String? = null,
    var content: String? = null
)
