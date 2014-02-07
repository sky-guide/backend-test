package modules

import geb.Module

class BookListItemModule extends Module {

    static content = {
        id { $('td')[0] }
        name { $('td')[1] }
    }
}
