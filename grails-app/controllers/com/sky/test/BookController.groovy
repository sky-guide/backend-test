package com.sky.test

import grails.converters.JSON

class BookController {

    def index() {
        def books = Book.findAll().collectEntries { book -> [book.name, book] }.values()
        withFormat {
            html pages: books
            json { render books as JSON }
        }
    }

    def show(String id) {
        def books = Book.findAllByName(id)

        withFormat {
            html pages: books
            json { render books as JSON }
        }
    }
}
