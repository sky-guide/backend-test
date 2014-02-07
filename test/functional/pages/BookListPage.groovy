package pages

import geb.Page
import modules.BookListItemModule

class BookListPage extends Page {
    static url = "/book/index"
    static at = { title == "Books" }

    static content = {
        pages { index -> moduleList BookListItemModule, $('.book-item'), index}
    }


}
