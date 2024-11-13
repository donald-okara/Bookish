package com.don.preface.fake.data

import com.don.preface.data.model.BookItem
import com.don.preface.data.model.BookListItemResponse
import com.don.preface.data.model.ImageLinks
import com.don.preface.data.model.VolumeInfo
import retrofit2.Response

object FakeBooksDataSource {

    private val fakeBookListItemResponse: BookListItemResponse = BookListItemResponse(
        kind = "books#volumes",
        totalItems = 3,
        items = listOf(
            BookItem(
                id = "1",
                volumeInfo = VolumeInfo(
                    title = "The Art of Coding",
                    authors = listOf("Alice Johnson"),
                    publisher = "Tech Books Publishing",
                    publishedDate = "2020-09-15",
                    description = "A comprehensive guide to mastering the art of coding, from basics to advanced techniques.",
                    imageLinks = ImageLinks(
                        smallThumbnail = "https://example.com/image1_small.jpg",
                        thumbnail = "https://example.com/image1_thumb.jpg",
                        small = "https://example.com/image1_small.jpg",
                        medium = "https://example.com/image1_medium.jpg",
                        large = "https://example.com/image1_large.jpg",
                        extraLarge = "https://example.com/image1_extra_large.jpg"
                    ),
                    previewLink = "https://example.com/book1_preview"
                )
            ),
            BookItem(
                id = "2",
                volumeInfo = VolumeInfo(
                    title = "Journey Through Data",
                    authors = listOf("Michael Reed", "Sophia Chen"),
                    publisher = "Data Insights Inc.",
                    publishedDate = "2018-06-23",
                    description = "An exploration of data science and analytics, covering key concepts, techniques, and applications.",
                    imageLinks = ImageLinks(
                        smallThumbnail = "https://example.com/image2_small.jpg",
                        thumbnail = "https://example.com/image2_thumb.jpg",
                        small = "https://example.com/image2_small.jpg",
                        medium = "https://example.com/image2_medium.jpg",
                        large = "https://example.com/image2_large.jpg",
                        extraLarge = "https://example.com/image2_extra_large.jpg"
                    ),
                    previewLink = "https://example.com/book2_preview"
                )
            ),
            BookItem(
                id = "3",
                volumeInfo = VolumeInfo(
                    title = "Mastering Android Development",
                    authors = listOf("Emma Brown"),
                    publisher = "Mobile Dev Press",
                    publishedDate = "2021-01-10",
                    description = "A practical guide to Android development, covering Jetpack Compose, architecture, and modern tools.",
                    imageLinks = ImageLinks(
                        smallThumbnail = "https://example.com/image3_small.jpg",
                        thumbnail = "https://example.com/image3_thumb.jpg",
                        small = "https://example.com/image3_small.jpg",
                        medium = "https://example.com/image3_medium.jpg",
                        large = "https://example.com/image3_large.jpg",
                        extraLarge = "https://example.com/image3_extra_large.jpg"
                    ),
                    previewLink = "https://example.com/book3_preview"
                )
            )
        )
    )

    val fakeBookList: Response<BookListItemResponse> = Response.success(fakeBookListItemResponse)

}