package pages

import geb.Page
import modules.BookListItemModule

import static java.net.URLEncoder.encode

class BookVersionsPage extends Page {
    static url = "/book/show"
    static at = { title == "Book Versions" }

    static content = {
        versions { index -> moduleList BookListItemModule, $('.book-item'), index}
    }

    @Override
    String convertToPath(Object... args) {
        "/" + args.collect { encode(it, "UTF-8") }.join('/')
    }
}
