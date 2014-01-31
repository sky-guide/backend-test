package modules

import geb.Module

class PageListItemModule extends Module {

    static content = {
        id { $('td')[0] }
        name { $('td')[1] }
    }
}
