package com.sky.test

import grails.converters.JSON

class PageController {

    def index() {
        def pages = Page.findAll().collectEntries { page -> [page.name, page] }.values()
        withFormat {
            html pages: pages
            json { render pages as JSON }
        }
    }

    def show(String id) {
        def pages = Page.findAllByName(id)

        withFormat {
            html pages: pages
            json { render pages as JSON }
        }
    }
}
