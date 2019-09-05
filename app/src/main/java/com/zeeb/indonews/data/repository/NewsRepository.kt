package com.zeeb.indonews.data.repository

import com.zeeb.indonews.data.model.ArticlesItem
import io.reactivex.Single

interface NewsRepository {
    fun getTopHeadlines() :Single<List<ArticlesItem>>
}