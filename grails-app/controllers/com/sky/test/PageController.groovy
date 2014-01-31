package com.sky.test

class PageController {

    def index() {
        def pages = Page.findAll().collectEntries { page -> [page.name, page] }.values()
        [pages: pages]
    }

    def show(String id) {
        def pages = Page.findAllByName(id)
        [pages: pages]
    }
}
